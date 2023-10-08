package com.javafortesters.chap009arraysiteration.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysIterationTests {

    //arrays (fixed size) creations:
    int[] integersInArray = new int[10]; //declare and create an array of fixed size
    int[] ints1To10 = {1,2,3,4,5,6,7,8,9,10}; //declare and create an array with actual values
    int[] uninitializedArray; //declare an array for later initialization

    String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


    @Test
    public void testWorkdaysArray() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (String workday : workdays){
            System.out.println(workday);
        }
        String workdaysConcatenated = "";
        for (String workday : workdays){
            workdaysConcatenated = workdaysConcatenated + " | " + workday;
        }
        System.out.println(workdaysConcatenated);

        assertEquals("Tuesday", workdays[1]);
        assertEquals(5, workdays.length);
        assertEquals(" | Monday | Tuesday | Wednesday | Thursday | Friday", workdaysConcatenated);
    }

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};

        for (String numberText : numbers0123){
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void forLoopsUsingIndexFixedConditons(){
        String days = "";
        for (int i=0; i<5; i++){
            days = days + "|" + i + "-" + workdays[i];
        }
        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday", days);
    }

}
