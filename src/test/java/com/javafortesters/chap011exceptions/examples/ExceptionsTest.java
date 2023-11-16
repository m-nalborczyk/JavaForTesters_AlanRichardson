package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsTest {

    @Test
    public void throwANullPointerException(){
        Integer age = null;

        String ageAsString = age.toString();

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 18 years old.", yourAge);
    }

}
