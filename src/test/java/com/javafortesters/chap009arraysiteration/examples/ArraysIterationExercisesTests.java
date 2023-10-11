package com.javafortesters.chap009arraysiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysIterationExercisesTests {

    @Test
    public void testUsersCreatedInArray(){
        User[] users = {new User("bob", "12324sdx"), new User("adam", "@#Sdd2sd"), new User("cathy", "234Sx")};
        System.out.println(users.length);
        assertEquals("adam", users[1].getUsername());
        assertEquals("234Sx", users[2].getPassword());

        for (User username : users){
            System.out.println("user name: " + username.getUsername());
        }
    }

    @Test
    public void test100UsersCreated(){
        User[] users100 = new User[100];
        for (int i=0; i<100; i++){
            int userIndex = i +1;
            users100[i] = new User("username" + userIndex, "password" + userIndex);
        }

        //check creation
        for (User user : users100){
            System.out.println(user.getUsername() + " " + user.getPassword());
        }

        for (int i=0; i<100; i++){
            assertEquals(("username"+(i+1)), users100[i].getUsername());
            assertEquals(("password"+(i+1)), users100[i].getPassword());
        }
    }

    @Test
    public void sortWorkDays(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        System.out.println(Arrays.toString(workdays));
        assertEquals("Friday", workdays[0]);
        assertEquals("Monday", workdays[1]);
        assertEquals("Thursday", workdays[2]);
        assertEquals("Tuesday", workdays[3]);
        assertEquals("Wednesday", workdays[4]);
        String[] workdaysWithLowerCase = {"monday", "tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdaysWithLowerCase);
        System.out.println(Arrays.toString(workdaysWithLowerCase));
    }

}
