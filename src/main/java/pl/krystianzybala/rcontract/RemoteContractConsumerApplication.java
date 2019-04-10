package pl.krystianzybala.rcontract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class RemoteContractConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteContractConsumerApplication.class, args);
    }


}

