package com.touzani.clientservice;

import com.touzani.clientservice.entities.Client;
import com.touzani.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(Client.builder()
                                            .nom("TOUZANI")
                                            .prenom("KARIM")
                                            .age(23F)
                                        .build());

            clientRepository.save(Client.builder()
                                            .nom("TOUZANI")
                                            .prenom("KARIM")
                                            .age(23F)
                                        .build());
};
        }
    }
