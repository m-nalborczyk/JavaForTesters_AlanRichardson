package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListInterfaceExercisesTest {

    @Test
    public void createAndManipulateListOfUsers() {
        List<User> users = new ArrayList<>();

        User marcin = new User("marcin_login", "pass##$123");
        User kasia = new User("kasia_login", "passKate34");

        users.add(marcin);
        assertEquals(marcin, users.get(0));
        assertEquals(1, users.size());

        users.add(0, kasia);
        assertEquals(kasia, users.get(0));
        assertEquals(2, users.size());

        assertEquals(0, users.indexOf(kasia));
        assertEquals(1, users.indexOf(marcin));

        users.remove(0);
        assertEquals(1, users.size());

    }

}
