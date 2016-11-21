package io.zipcoder.microdb.simpledb;


import io.zipcoder.microdb.utility.Twople;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SimpleDB {


    private Table table = new Table();


    public String findById(long id){

        return table.get(id);
    }

    public long insert(String value){
        return table.add(value);
    }

    public List<Twople<Long, String>> findByName(String name) {
        return table.findAll(name);
    }
}
