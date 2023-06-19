package com.jeyan.dev.KafkaProducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftController {
    @PostMapping("/setName/{name}")
    public String setName(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/test")
    public String print(){
        return "Hello everyone !😊";
    }
}
