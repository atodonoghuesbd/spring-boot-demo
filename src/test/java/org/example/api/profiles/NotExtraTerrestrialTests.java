package org.example.api.profiles;

import org.example.api.DemoApplication;
import org.example.api.GreetingService;
import org.example.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

@DirtiesContext
@SpringBootTest(classes = {DemoApplication.class})
@ActiveProfiles({"default"})
public class NotExtraTerrestrialTests {
    private final GreetingService greetingService;

    @Autowired
    NotExtraTerrestrialTests(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Test
    public void extraTerrestrialProfile() {
        assert this.greetingService instanceof HelloWorldService;
    }
}
