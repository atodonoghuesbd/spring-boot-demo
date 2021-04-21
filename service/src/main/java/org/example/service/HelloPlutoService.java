package org.example.service;

import org.example.api.GreetingService;

public class HelloPlutoService implements GreetingService {
    @Override
    public String greet() {
        return "I used to a planet like you, but then I took a Neil De Grasse Tyson to the name.";
    }
}
