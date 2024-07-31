package com.revature.controllers;

import com.revature.models.Actor;
import com.revature.models.ActorForm;
import com.revature.services.ActorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

@AutoConfigureMockMvc
@SpringBootTest(classes = com.revature.app.SpringMovieAppApplication.class)
public class ActorControllerTests {

    @MockBean
    ActorService as;

    @Autowired
    MockMvc mvc;

    @Test
    void getActorById() throws Exception {

        Actor a = new Actor(1, "Tom Cruise", (short) 55, 600000000);
        ActorForm actorForm = new ActorForm(1, "Tom Cruise", (short) 55, 600000000, new ArrayList<>());

        Mockito.when(as.getActor(1)).thenReturn(a);
        Mockito.when(as.convertToActorForm(a)).thenReturn(actorForm);

        ResultActions ra = mvc.perform(get("/actors/1"));
        ra.andExpect(status().isOk());
    }

    @Test
    void deleteActorSuccess() throws Exception {

        Mockito.when(as.deleteActor(1)).thenReturn(true);

        ResultActions ra = mvc.perform(delete("/actors/1"));
        String result = ra.andExpect(status().isNoContent())
                .andReturn()
                .getResponse()
                .getContentAsString();

        Assertions.assertEquals(result, "true");

    }

    @Test
    void deleteActorFailure() throws Exception {
        //Mocking the ID passed in is not in a valid form. BUT for testing purposes I am still passing
        //in a valid number and just telling Mockito to PRETEND it didnt work.
        Mockito.when(as.deleteActor(1)).thenReturn(false);

        ResultActions ra = mvc.perform(delete("/actors/1"));
        String result = ra.andExpect(status().isBadRequest())
                .andReturn()
                .getResponse()
                .getContentAsString();

        Assertions.assertEquals(result, "false");
    }

    @Test
    void deleteBadActor() throws Exception {
        //Passing in an ID for an Actor that does not exist.
        Mockito.doThrow(EmptyResultDataAccessException.class).when(as).deleteActor(1);

        ResultActions ra = mvc.perform(delete("/actors/1"));
        ra.andExpect(status().isUnprocessableEntity());
    }

}