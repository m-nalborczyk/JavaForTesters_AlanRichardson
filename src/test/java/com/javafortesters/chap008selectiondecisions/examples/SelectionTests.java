package com.javafortesters.chap008selectiondecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelectionTests {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";

        url = url.startsWith("http://") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }
    private String addHttp(String url){
        return "http://" + url;
    }

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";
        if (!url.startsWith("http://")){
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if (url.startsWith("http://")){
            //do nothing
        } else {
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "seleniumsimplified.com";
        if (url.startsWith("http")){
            //do nothing
        } else {
            if (!url.startsWith("www")){
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://www."));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

}
