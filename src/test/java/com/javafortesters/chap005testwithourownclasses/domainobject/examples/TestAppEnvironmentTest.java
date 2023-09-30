package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnvironment;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("URL should be http://192.123.0.3:67", "http://192.123.0.3:67", TestAppEnvironment.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain", "192.123.0.3", TestAppEnvironment.DOMAIN);
        assertEquals("Just the Port", "67", TestAppEnvironment.PORT);
    }

}
