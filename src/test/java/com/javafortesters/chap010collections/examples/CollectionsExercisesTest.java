package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionsExercisesTest {

    @Test
    public void useAForLoopInsteadOfAWhileLoop() {
        String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};
        List<String> days = Arrays.asList(someDays);

        int indexForMonday;
        for (indexForMonday = 0; !days.get(indexForMonday).equals("Monday"); indexForMonday++) {
        }
        assertEquals("Monday is at index 3", 3, indexForMonday);


        //examples of collection declaration in collection classes
        Collection workdays = new LinkedHashSet();
        Collection workdays2 = new LinkedList();
        Collection workdays3 = new HashSet();
        //example of collection declaration in variable and instantiation of it as class that implements its iterface
        Collection workdays4;
        workdays4 = new ArrayList();

        //Collection when not specified with the type defaults to object (needs casting)
        /*below instantiation of collection declared with specific type (the best approach when we know collection is
        meant to have the same type data)*/
        Collection<Integer> years = new ArrayList<Integer>();
    }

    @Test
    public void operationsOnCollections(){

        Collection<String> weekendDays = new ArrayList<String>();
        Collection<String> workDays = new ArrayList<String>();
        Collection<String> weekDays = new ArrayList<String>();

        //adding elements to collection
        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");

        assertEquals(5, workDays.size());
        assertEquals(0, weekDays.size());

        //adding collection elements to another collection
        weekDays.addAll(workDays);
        assertEquals(5, weekDays.size());
        assertEquals(workDays.size(), weekDays.size());

        weekendDays.add("Saturday");
        weekendDays.add("Sunday");
        weekDays.addAll(weekendDays);
        assertEquals(7, weekDays.size());

        //checking if collection contains all elements of another collection (can have more elements itself)
        assertTrue(weekDays.containsAll(weekendDays));
        assertTrue(weekDays.containsAll(workDays));









    }
}
