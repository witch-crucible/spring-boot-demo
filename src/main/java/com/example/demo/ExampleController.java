package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

    @GetMapping(value = "/home")
    public String get() {
        String test = "get";
        return test;
    }

    @PostMapping(value = "/home")
    public String post() {
        return "post";
    }

}
