package org.example.service.configuration;

import org.example.api.GreetingService;
import org.example.service.ConfigurableHelloService;
import org.example.service.HelloMarsService;
import org.example.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultConfiguration {
    private static final String MARS = "mars";
    private static final String JUPITER = "jupiter";

    @Value("${planet:earth}")
    public String planet;

    @Bean
    @ConditionalOnMissingBean
    public GreetingService greetingService() {
        switch(planet) {
            case MARS:
                return new HelloMarsService();
            case JUPITER:
                return new ConfigurableHelloService(JUPITER);
            default:
                return new HelloWorldService();
        }
    }
}
