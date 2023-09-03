package com.example.banking_application;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Banking Application Java Spring Boot",
                description = "Back-end Test APIs",
                version = "v1.0",
                contact = @Contact(
                        name = "Ngo Gia Phat",
                        email = "phatng.it.dev@gmail.com",
                        url = "https://github.com/ngphat-it-dev/Banking-Application"
                ),
                license = @License(
                        name = "Java Spring Boot",
                        url = "https://github.com/ngphat-it-dev/Banking-Application"
                )
        ),externalDocs = @ExternalDocumentation(
                description = "Banking Application Documentation",
                url = "https://github.com/ngphat-it-dev/Banking-Application"
)
)
public class BankingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingApplication.class, args);
    }

}
