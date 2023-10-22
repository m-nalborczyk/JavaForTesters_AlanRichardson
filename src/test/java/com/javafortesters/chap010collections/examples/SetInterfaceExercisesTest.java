package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetInterfaceExercisesTest {

    @Test
    public void createAndManipulateSetOfUsers(){
        Set users = new HashSet();
        User kasia = new User("kasia1","pass1");
        users.add(kasia);
        users.add(kasia);

        assertEquals(1, users.size());
    }
}
