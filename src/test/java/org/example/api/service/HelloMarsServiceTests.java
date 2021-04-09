package org.example.api.service;

import org.example.api.DemoApplication;
import org.example.api.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"planet=mars"}, classes = {DemoApplication.class})
public class HelloMarsServiceTests {
    private final GreetingService greetingService;

    @Autowired
    HelloMarsServiceTests(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Test
    void helloMarsServiceLoads() {
        assert this.greetingService instanceof HelloMarsService;
    }

    @Test
    void helloWorldServiceDoesNotLoad() {
        assert !(this.greetingService instanceof HelloWorldService);
    }
}
