package com.cts.helloworld.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloworldController {
    
    @GetMapping(value = "/greetings", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getGreetings(@RequestParam("name") String name){
        return "Hello " + name + "!";
    }
}
