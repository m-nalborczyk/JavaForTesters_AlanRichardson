package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4); //the same as Integer four = 4;
        assertEquals("intValue returns int 4", 4, four.intValue());
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());

    }
    @Test
    public void toHexString(){
        assertEquals("toHexString returns b for 11", "b", Integer.toHexString(11));
        assertEquals("toHexString returns a for 10", "a", Integer.toHexString(10));
        assertEquals("toHexString returns 3 for 3", "3", Integer.toHexString(3));
        assertEquals("toHexString returns 15 for 21", "15", Integer.toHexString(21));
    }
    @Test
    public void confirmMaxAndMinForInteger(){
        assertEquals("MIN_VALUE constant variable is equal to -2147483648", -2147483648, Integer.MIN_VALUE);
        assertEquals("MAX_VALUE constant variable is equal to 2147483647", 2147483647, Integer.MAX_VALUE);
    }

    @Test
    public void checkEqualityBetweenIntegers(){
        Integer five1 = 5;
        Integer five2 = 5;
        System.out.println(five1.equals(five2));
        System.out.println(five1 == five2);
    }

}
