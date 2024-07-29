package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    Main m = new Main();

    @Test
    public void Test1(){
        String expected = "hello world";
        String actual = m.mainMethod();
        Assert.assertEquals(expected,actual);
    }


}
