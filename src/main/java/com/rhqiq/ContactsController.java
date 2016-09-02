package com.rhqiq;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @RequestMapping(method= RequestMethod.GET)
    public String list(@RequestParam(value = "name", defaultValue="contacts") String name){
        return name;
    }

    @RequestMapping(method= RequestMethod.POST)
    public String save(@RequestParam(value = "name", defaultValue="save") String name){
        return name;
    }

    @RequestMapping(method= RequestMethod.PUT)
    public String edit(@RequestParam(value = "name", defaultValue="edit") String name){
        return name;
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public String delete(@RequestParam(value = "name", defaultValue="delete") String name){
        return name;
    }



}
