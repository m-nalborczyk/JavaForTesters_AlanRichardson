package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

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

        //removing element + checking contain
        workDays.add("Funday");
        assertTrue("Funday has been mistakely added to the collection", workDays.contains("Funday"));
        workDays.remove("Funday");
        assertFalse("Funday is still there?", workDays.contains("Funday"));

        //iterating over the collection with 'for each' loop
        for (String day : weekDays){
            System.out.println(day);
        }

        /*if not use 'Generics' (declaration of collection type) we would have to do casting as mentioned before
        which would look like:

        for (Object day : workDays) {
            String outputDay = (String)day;
            System.out.println(outputDay);
         */

        //clearing collection and checking if it is empty
        weekDays.clear();
        assertTrue(weekDays.isEmpty());
        assertEquals(0, weekDays.size());
        weekDays.addAll(workDays);
        weekDays.addAll(weekendDays);
        assertEquals(7, weekDays.size());
        assertFalse(weekDays.isEmpty());

        //removing all collection elements from another collection
        assertEquals(7, weekDays.size());
        assertTrue("Sunday in in week days collection", weekDays.contains("Sunday"));
        weekDays.removeAll(weekendDays);

        assertEquals(5, weekDays.size());
        assertTrue("Sunday and Saturday are no longer in week days collection", !weekDays.containsAll(weekendDays));
        weekDays.addAll(weekendDays);

        //retaining all collection elements within another collection and removing the rest
        weekDays.retainAll(weekendDays);
        System.out.println();
        for (String day : weekDays){
            System.out.println(day);
        }
        weekDays.addAll(workDays); //adding what was removed
        System.out.println();
        System.out.println(weekDays); //now order is different

        //converting collection to array 2 ways

        //1st way: toArray()
        //without parameter it will return an array of Object so we will have to perform casting
        Object[] daysOfWeekArray = weekDays.toArray();
        assertEquals("Saturday".length(), ((String)daysOfWeekArray[0]).length()); //now Saturday is first

        //2nd way: toArray(anArray)
        //with parameter will not require casting
        String[] anotherArray = new String[weekDays.size()]; //initialization of empty array with length equal to weekDays size
        weekDays.toArray(anotherArray); //filling array with weekDays elements
        assertEquals("Saturday".length(), anotherArray[0].length()); //now we dont require casting
    }
    @Test
    public void createAndManipulateCollectionOfUsers(){
        Collection<User> someUsers = new ArrayList<>();
        assertTrue(someUsers.size() == 0 && someUsers.isEmpty());
        User marcin = new User("login@marcin", "password23%4");
        User kasia = new User("katfit", "wspanialakatarzyna$69");
        assertEquals("login@marcin", marcin.getUsername());
        assertEquals("wspanialakatarzyna$69", kasia.getPassword());
        someUsers.add(marcin);
        someUsers.add(kasia);

    }
}
