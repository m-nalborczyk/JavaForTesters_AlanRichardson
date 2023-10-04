package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class Example {

    @Test
    public void conditionalOperatorsExplored(){
        assertTrue(true && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(true && false);
        assertFalse(false || false);
    }

    @Test
    public void ternaryOperatorsExplored(){
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue(5>4 ? true : false);
    }

}
