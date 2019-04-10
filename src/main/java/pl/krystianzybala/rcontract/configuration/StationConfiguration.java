package pl.krystianzybala.rcontract.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class StationConfiguration {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
