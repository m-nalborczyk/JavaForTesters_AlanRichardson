package com.javafortesters.chap009arraysiteration.examples;

import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void testArraysMethods() {
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";
        for (String weekday : weekDays) {
            System.out.println(weekday);
        }

        String[] truncatedWeekDays = Arrays.copyOf(weekDays, 3);
        for (String weekday : truncatedWeekDays) {
            System.out.println(weekday);
        }
        assertEquals("Tuesday", truncatedWeekDays[1]);

        String[] subsetDays = Arrays.copyOfRange(weekDays, 2, 5);
        for (String weekday : subsetDays) {
            System.out.println(weekday);
        }

        int[] minusOneFullArray = new int[30];
        Arrays.fill(minusOneFullArray, -1);
        int index = 0;
        for (int number : minusOneFullArray) {
            index = 1 + index;
            System.out.println(index + ": " + number);
        }

        int[] tenItems = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        //fill cells 5-9 with '2'
        Arrays.fill(tenItems, 5, 10, 2);
        //0-4 are untouched
        assertEquals(0, tenItems[0]);
        assertEquals(0, tenItems[4]);
        //5-9 now equal 2
        assertEquals(2, tenItems[5]);
        assertEquals(2, tenItems[9]);
        for (int number : tenItems) {
            System.out.println(number);
        }
    }

    @Test
    public void testSorting(){
        int[] outOfOrder = {2,4,2,1,5,0};
        int[] sortedArray = Arrays.copyOf(outOfOrder, outOfOrder.length);
        Arrays.sort(sortedArray);
        System.out.println("Original array: " + Arrays.toString(outOfOrder));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        assertEquals(5, sortedArray[sortedArray.length-1]);
    }

    @Test
    public void testArraysOfArrays(){
        int[][] multi = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        assertEquals(1, multi[0][0]);
        assertEquals(7, multi[1][2]);
        assertEquals(14, multi[3][1]);

        int[][] ragged2d = {{1,2,3,4},
                            {5,6},
                            {7,8,9}
                            };
        assertEquals(4, ragged2d[0].length);
        assertEquals(2, ragged2d[1].length);
        assertEquals(3, ragged2d[2].length);

        assertEquals(4, ragged2d[0][3]);
        assertEquals(6, ragged2d[1][1]);
        assertEquals(7, ragged2d[2][0]);
    }

}
