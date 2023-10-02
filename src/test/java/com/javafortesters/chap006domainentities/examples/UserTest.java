package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "a42fss352$");
        assertEquals("given username", "admin", user.getUsername());
        assertEquals("given password", "a42fss352$", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User("not changeable username", "changeable password");
        user.setPassword("changed");
        assertEquals("setter password expected", "changed", user.getPassword());
    }




}
