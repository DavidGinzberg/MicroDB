package io.zipcoder.microdb;

import io.zipcoder.microdb.simpledb.SimpleDB;
import io.zipcoder.microdb.utility.Twople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FrontController {

    @Autowired
    SimpleDB db;

    @RequestMapping("/")
    public String rootResponse(){
        return "Hello";
    }

    @RequestMapping("/get/{id}")
    public String getById(@PathVariable long id){

        String res = db.findById(id);

        return res != null ? res : "No record found for ID: " + id;
    }

    @RequestMapping("/create/{name}")
    public String addRecord(@PathVariable String name){
        long id = db.insert(name);
        return String.format("%d: %s", id, name);
    }

    @RequestMapping("/search/{name}")
    public String searchByName(@PathVariable String name){
        List<Twople<Long, String>> results = db.findByName(name);
        return results.toString();
    }
}
