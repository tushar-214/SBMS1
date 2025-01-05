package com.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Mobile API Documentation")
                        .description("API documentation for Mobile application")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Tushar Bhosale")
                                .email("tushar.bhosale@example.com")));
    }
}
