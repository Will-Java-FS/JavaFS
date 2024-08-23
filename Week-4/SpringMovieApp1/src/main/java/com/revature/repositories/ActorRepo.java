package com.revature.repositories;

import com.revature.models.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepo extends CrudRepository<Actor, Integer> {

    List<Actor> findByName(String name);
    List<Actor> findByAge(short age);
    List<Actor> findByAgeAndWorth(short age, int worth);

}