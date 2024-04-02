package com.example.searchautocompletesystem.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello Worlㅇd";
    }
}