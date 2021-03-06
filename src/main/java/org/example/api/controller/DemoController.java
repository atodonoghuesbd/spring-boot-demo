package org.example.api.controller;

import org.example.api.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
    private final GreetingService greetingService;

    @Autowired
    DemoController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(path = "/greet", method = RequestMethod.GET)
    public ResponseEntity<String> greet() {
        return new ResponseEntity<>(greetingService.greet(),
                HttpStatus.OK);
    }
}
