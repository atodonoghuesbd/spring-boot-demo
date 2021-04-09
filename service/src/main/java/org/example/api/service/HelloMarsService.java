package org.example.api.service;

import org.example.api.GreetingService;

public class HelloMarsService implements GreetingService {

    @Override
    public String greet() {
        return "Hello, Mars!";
    }
}
