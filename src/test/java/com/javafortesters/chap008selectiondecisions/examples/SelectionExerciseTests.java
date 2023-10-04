package com.javafortesters.chap008selectiondecisions.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionExerciseTests {

    @Test
    public void testCorrectForm(){
        assertEquals("2 == cats", "cats", catOrCats(2));
        assertEquals("1 == cat", "cat", catOrCats(1));
    }

    public String catOrCats(int number){
         return (number > 1) ? "cats" : "cat";
    }

    @Test
    public void checkTruth(){
        boolean truthy = true;
        if (truthy == true) assertTrue(truthy);
    }

    @Test
    public void checkTruthAndFalse(){
        boolean truthy = true;
        if (truthy == true){
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void checkTruthAndFalseWithElse(){
        boolean truthy = false;
        if (truthy == true) {
            assertTrue(truthy);
        } else {
            assertFalse(truthy);
        }
        if (truthy == true) {
            assertTrue(truthy);
            assertFalse(!truthy);
        } else {
            assertFalse(truthy);
        }

    }


}
