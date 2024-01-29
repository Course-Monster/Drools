package africa.skunkworks.training.drools.insurance.web.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Drools Training Insurance").description(
                                "Drools Training Insurance").version("1.0.0-SNAPSHOT")
                        .contact(new Contact().name("Skunkworks Developers")
                                .url("https://github.com/Course-Monster/Drools.git")));
    }
}
