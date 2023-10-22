package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetInterfaceTest {

    //SET does not allow storing duplicates, adding duplicate is ignored
    //ordering is not guaranteed, iterating through a set might not bring the same order of elements

    @Test
    public void setDoesNotAllowDuplicates(){
        Set workdays = new HashSet();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

}
