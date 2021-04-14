package org.example.api.service;

import org.example.api.DemoApplication;
import org.example.api.GreetingService;
import org.example.service.HelloMarsService;
import org.example.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {DemoApplication.class})
public class HelloWorldServiceTests {
    private final GreetingService greetingService;

    @Autowired
    HelloWorldServiceTests(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Test
    void helloMarsServiceLoads() {
        assert this.greetingService instanceof HelloWorldService;
    }

    @Test
    void helloWorldServiceDoesNotLoad() {
        assert !(this.greetingService instanceof HelloMarsService);
    }
}
