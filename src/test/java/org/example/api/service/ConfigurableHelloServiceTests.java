package org.example.api.service;

import org.example.api.DemoApplication;
import org.example.api.GreetingService;
import org.example.service.ConfigurableHelloService;
import org.example.service.HelloMarsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"planet=jupiter"}, classes = {DemoApplication.class})
public class ConfigurableHelloServiceTests {
    private final GreetingService greetingService;

    @Autowired
    ConfigurableHelloServiceTests(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Test
    void helloJupiterServiceLoads() {
        assert this.greetingService instanceof ConfigurableHelloService;
    }

    @Test
    void helloWorldServiceDoesNotLoad() {
        assert !(this.greetingService instanceof HelloMarsService);
    }

    @Test
    void helloJupiterGreeting() {
        assert this.greetingService.greet().equalsIgnoreCase("jupiter");
    }
}
