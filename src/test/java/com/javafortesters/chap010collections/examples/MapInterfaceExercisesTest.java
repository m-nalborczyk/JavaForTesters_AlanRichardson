package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MapInterfaceExercisesTest {

    @Test
    public void createMapOfUserObjects(){
        Map<String, User> users = new HashMap<>();

        User marcin = new User("marcinlogin", "password425423");
        User kasia = new User("kasialogin", "passwords234s");
        assertEquals("passwords234s", kasia.getPassword());
        assertEquals("marcinlogin", marcin.getUsername());

        users.put("user1", marcin); //nice approach would be using marcin.getUsername() method to have keys as logins of the users
        assertEquals(marcin, users.get("user1"));
        assertEquals(1, users.size());
        users.put("user1", kasia);
        assertEquals(kasia, users.get("user1"));
        assertEquals(1, users.size());
    }

}
