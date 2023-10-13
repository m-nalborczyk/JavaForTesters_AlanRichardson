package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IterationWithForAndWhileTest {


    @Test
    public void findMondayWithLoops() {
        String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};
        List<String> days = Arrays.asList(someDays);

        int forCount = 0;
        for(String day : days) {
            if(day.equals("Monday")){
                break;
            }
            forCount++;
        }
        assertEquals("Monday is at position 3", 3, forCount);

        int loopCount;
        for(loopCount=0; loopCount<=someDays.length; loopCount++){
            if(days.get(loopCount).equals("Monday")){
                break;
            }
        }
        assertEquals("Monday is at position 3", 3, loopCount);

        int docCount=-1;
        do {
            docCount++;
        } while (!days.get(docCount).equals("Monday"));// the same as >>>>> (!someDays[docCount].equals("Monday"));
        assertEquals("Monday is at position 3", 3,docCount);
    }
}
