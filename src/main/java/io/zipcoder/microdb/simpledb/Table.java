package io.zipcoder.microdb.simpledb;

import io.zipcoder.microdb.utility.Twople;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {


    private long nextId = 1;

    Map<Long, String> rows = new HashMap<>();

    public long add(String name) {
        rows.put(nextId, name); //just strings so no defensive copy needed
        return nextId++;

    }

    public String get(long id){
        return rows.get(id);
    }

    public List<Twople<Long, String>> findAll(String name) {
        List<Twople<Long, String>> result = new ArrayList<>();
        for(Map.Entry<Long, String> e : rows.entrySet()){
            if(e.getValue().equals(name)){
                result.add(new Twople<>(e.getKey(), e.getValue()));
            }
        }
        return result;
    }
}