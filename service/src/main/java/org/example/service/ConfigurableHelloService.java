package org.example.service;

import org.example.api.GreetingService;

public class ConfigurableHelloService implements GreetingService {
    private final String planet;

    public ConfigurableHelloService(String planet) {
        this.planet = planet;
    }

    @Override
    public String greet() {
        return planet;
    }
}
