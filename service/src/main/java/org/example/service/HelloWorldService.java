package org.example.service;

import org.example.api.GreetingService;

public class HelloWorldService implements GreetingService {

    @Override
    public String greet() {
        return "Hello, world!";
    }
}
