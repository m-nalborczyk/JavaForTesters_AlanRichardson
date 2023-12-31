package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapInterfaceTest {

    //MAP is a collection where each element is a value, and the element is stored with an associated key
    //thus MAP is a collection of key - value pairs
    //each key must be unique !! if using existing key the value will be overwritten
    //each key maps only to one value!

    /*
    The same methods as in Collection:
    .size()
    .clear()
    .isEmpty()

    Similar to Collection .contains() Map has .contaisKey() and .containsValue()

    Others are:
    .put(k,v) to add key-value pair to the map
    .remove(k) to remove the element with that key
    .entrySet to return a Set of all elements as Map.Entry objects
    .get(k) to return the element based on the key
    .containsKey(k) returns true if the key is in the Map
    .containsValue(v) returns true if the value is in the Map
    .values returns Collection of all values
    .keySet returns Set of all keys
    .putAll(m) adds a Map (m) to the Map object
     */

    @Test
    public void mapOperations() {
        //different declarations for String as key and User as value Maps:
        Map<String, User> mapA = new HashMap<>();
        Map<String, User> mapB = new HashMap<String, User>();
        Map<String, User> mapC = new <String, User>HashMap();

        Map<String, String> map = new HashMap<>();

        //put(k,v)
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        assertEquals(3, map.size());
        map.put("key1","newvalue1");
        assertEquals("newvalue1",map.get("key1"));

        //get(k)
        assertEquals("newvalue1", map.get("key1"));
        assertEquals("value2",map.get("key2"));
        assertEquals("value3", map.get("key3"));
        assertEquals(null, map.get("key4"));

        //remove(k)
        map.remove("key1");
        assertEquals(2, map.size());
        assertEquals(null, map.get("key1"));

    }
    @Test
    public void otherMapOperations() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(3, map.size());

        //containsKey(k) containsValue(v)
        assertTrue(map.containsKey("key2"));
        assertTrue(map.containsValue("value3"));

        //putAll(m) - adding(copying) one map to another map; if key from added map exists then the value from the new map overwrites existing one
        Map<String, String> mapToBeAdded = new HashMap<>();
        mapToBeAdded.put("key1", "other value than in the first map");
        mapToBeAdded.put("key4", "value4");
        map.putAll(mapToBeAdded);
        assertEquals(4, map.size());
        assertEquals("other value than in the first map", map.get("key1"));

        //clear size isEmpty
        assertEquals(2, mapToBeAdded.size());
        mapToBeAdded.clear();
        assertTrue(mapToBeAdded.isEmpty());
        assertEquals(0, mapToBeAdded.size());

        //values - returns values from the Map in the form of Collection
        Collection<String> values = map.values();
        System.out.println(values);

        //keySet - returns keys from the Map in the form of Set
        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
    @Test
    public void gettingKeyValuePairsInMapEntryObjects(){
        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        //entrySet - returns Map.Entry objects ("key,value" pairs) from the Map in the form of Set
        /*
        Entry provides methods:
        -getValue to return the value
        -getKey to return the key
        -setValue to set the value
         */
        Set<Map.Entry<String,String>> entries = map.entrySet();
        System.out.println(entries);

        //below code iterates through the entries in the Map and sets all the values to "bob"
        for (Map.Entry<String,String> entry : entries){
            entry.setValue("bob");
        }
        System.out.println(entries);





    }
}
