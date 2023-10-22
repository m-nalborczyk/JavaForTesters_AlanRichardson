package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ListInterfaceTest {

    @Test
    public void listInterfaceExplored() {
        /*
        List<String> aList = new ArrayList<String>();
        aList.get(i);
        aList.remove(i);
        aList.add(i, e);
        aList.addAll(i, collection);
        aList.indexOf(e);
        aList.lastIndexOf(e);
        aList.set(i, e);
        aList.subList(fromIndex, toIndex);
        */
    }

    @Test
    public void getAnElementAtIndex(){
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));
    }

    @Test
    public void removeAnElementAtIndex(){
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        days.remove(1);
        assertEquals(2, days.size());
        assertEquals("Wednesday", days.get(1));
    }

    @Test
    public void addAnElementAtIndex(){  //when added it doesnt overwrite it expands the list and moves everything else in the list
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");

        days.add(0, "Monday");
        days.add(2, "Wednesday");
        days.add(4, "Friday");
        days.add(6, "Sunday");
        System.out.println(days);
    }

    @Test
    public void addACollectionAtIndex(){
        List<String> days = new ArrayList<>();
        List<String> missingDays = new ArrayList<>();

        days.add("Monday");
        days.add("Friday");

        missingDays.add("Tuesday");
        missingDays.add("Wednesday");
        missingDays.add("Thursday");

        days.addAll(1, missingDays);
        assertEquals(5, days.size());

        System.out.println(days);
    }

    @Test
    public void findIndexOfElement(){
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");
        System.out.println(days.indexOf("Thursday"));
        assertEquals(2, days.indexOf("Saturday"));
    }

    @Test
    public void findLastIndexOfElement(){ //if no duplicates .lastIndexOf() works the same as .indexOf()
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");
        days.add("Thursday");
        days.add("Friday");
        assertEquals(3, days.lastIndexOf("Thursday"));
    }

    @Test
    public void setElementAtIndex(){ //overwrites existing element and size of list stays the same
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");
        System.out.println(days);

        days.set(1, "Wednesday");
        assertEquals("Wednesday", days.get(1));
        assertEquals(3, days.size());
        System.out.println(days);
    }

    @Test
    public void createASublistFromAnotherListBasedOnIndexes(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i<=10; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        //create sublist from index 4 to 6
        List<Integer> subList = numbers.subList(4, 7); // toIndex needs to be +1 from the target
        System.out.println(subList);
    }

}
