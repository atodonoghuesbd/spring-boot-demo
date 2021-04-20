package org.example.api.service;

import org.example.api.DemoApplication;
import org.example.api.GreetingService;
import org.example.service.HelloPlutoService;
import org.example.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"planet=pluto"}, classes = {DemoApplication.class})
public class HelloPlutoServiceTests {
    private final GreetingService greetingService;

    @Autowired
    HelloPlutoServiceTests(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Test
    void helloPlutoService() {
        assert this.greetingService instanceof HelloPlutoService;
    }

    @Test
    void helloWorldServiceDoesNotLoad() {
        assert !(this.greetingService instanceof HelloWorldService);
    }
}
