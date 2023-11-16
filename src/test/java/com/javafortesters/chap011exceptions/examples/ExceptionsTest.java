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

    @Test
    public void catchANullPointerException(){
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e){

            //as exception in variable is object it has methods such below that can be used
            System.out.println("getMessage - " + e.getMessage());
            System.out.println("getStacktrace - " + e.getStackTrace());
            System.out.println("printStacktrace - ");
            e.printStackTrace();

            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + ageAsString + " years old.";
        assertEquals("You are 18 years old.", yourAge);
    }

    @Test
    public void catchMoreThanOneException(){
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        } catch (IllegalArgumentException e){ //as we handle 2 possible exceptions we need to make sure ageAsString is initialized here as well
            System.out.println("Illegal Argument - " + e.getMessage());
            age = 18;
            ageAsString = age.toString();

        }
        String yourAge = "You are " + ageAsString + " years old.";
        assertEquals("You are 18 years old.", yourAge);
    }

}

