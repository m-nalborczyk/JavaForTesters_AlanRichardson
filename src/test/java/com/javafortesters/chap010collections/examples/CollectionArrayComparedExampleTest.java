package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionArrayComparedExampleTest {

    @Test
    public void simpleArrayExample(){
        String[] number0123 = {"zero", "one", "two", "three"};

        for(String numberText : number0123){
            System.out.println(numberText);
        }
        assertEquals("zero", number0123[0]);
        assertEquals("three", number0123[3]);
    }

    @Test
    public void simpleCollectionExample() {
        String[] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> number0123Collection = Arrays.asList(numbers0123Array);

        for (String numberText : number0123Collection) {
            System.out.println(numberText);
        }
        assertEquals("zero", number0123Collection.get(0));
        assertEquals("two", number0123Collection.get(2));
    }

    @Test
    public void simpleDynamicCollectionExample(){
        //dynamic size capability
        List<String> dynamicList = new ArrayList<String>();
        dynamicList.add("one");
        dynamicList.add("two");
        //you can add more
        assertEquals("two", dynamicList.get(1));
    }
}
