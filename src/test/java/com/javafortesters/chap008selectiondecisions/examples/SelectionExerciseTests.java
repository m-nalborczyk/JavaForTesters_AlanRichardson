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

    @Test
    public void checkNestedIfElseHorror(){
        boolean truthy = true;
        boolean falsey = true;

        if (truthy){
            if (!falsey){
                if (truthy && !falsey){
                    if (truthy || falsey){
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            } else {
                assertTrue(truthy);
                assertTrue(falsey);
            }
        } else {
            if (!truthy){
                if (falsey){
                    assertTrue(falsey);
                    assertFalse(truthy);
                } else {
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }

    @Test
    public void checkCountry(){
        assertEquals("United Kingdom", likelyCountryIs("UK"));
        assertEquals("United Kingdom", likelyCountryIs("uK"));
        assertEquals("United Kingdom", likelyCountryIs("Uk"));
        assertEquals("United Kingdom", likelyCountryIs("uk"));
        assertEquals("United States", likelyCountryIs("USA"));
        assertEquals("United States", likelyCountryIs("US"));
        assertEquals("France", likelyCountryIs("FR"));
        assertEquals("Sweden", likelyCountryIs("SE"));
        assertEquals("Rest of the World", likelyCountryIs("xx"));
    }
    public String likelyCountryIs(String code){
        String likelyCountry;

        switch (code.toLowerCase()){
            case "uk":
                likelyCountry = "United Kingdom";
                break;
            case "us":
            case "usa":
                likelyCountry = "United States";
                break;
            case "fr":
                likelyCountry = "France";
                break;
            case "se":
                likelyCountry = "Sweden";
                break;
            default:
                likelyCountry = "Rest of the World";
                break;
        }
        return likelyCountry;
    }


}
