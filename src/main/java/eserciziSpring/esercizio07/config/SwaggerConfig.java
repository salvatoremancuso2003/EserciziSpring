package eserciziSpring.esercizio07.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("My Api")
                        .description("Simple description for the exercise")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Salvatore Mancuso")
                                .url("https://develhope.com")
                                .email("salvatoremancuso703@gmail.com")));
    }
}
