package org.example.api.service.configuration;

import org.example.api.GreetingService;
import org.example.api.service.HelloMarsService;
import org.example.api.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultConfiguration {
    private static final String MARS = "mars";

    @Value("${planet:earth}")
    public String planet;

    @Bean
    public GreetingService greetingService() {
        return MARS.equals(planet) ? new HelloMarsService() : new HelloWorldService();
    }
}
