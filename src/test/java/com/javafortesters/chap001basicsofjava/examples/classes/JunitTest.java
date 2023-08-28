package com.javafortesters.chap001basicsofjava.examples.classes;

import org.junit.Test;

public class JunitTest {

    @Test
    public void canOutputMessageFromAClass(){
        AClassWithAMethod instantiatedObject = new AClassWithAMethod();
        instantiatedObject.aClassMethod();
    }
}
