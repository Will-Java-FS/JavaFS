package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.example.CreateObject;


public class MainTest {
    CreateObject co = new CreateObject();
    @Test
    public void testApp(){
        String expected ="Success: hello world";
        String actual = co.objectMethod("hello world");
        Assert.assertEquals(expected,actual);

    }
}
