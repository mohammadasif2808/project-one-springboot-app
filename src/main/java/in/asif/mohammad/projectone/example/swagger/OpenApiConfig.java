package in.asif.mohammad.projectone.example.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Project one example for portfolio APIs Microservice: API Reference and Usage")
                        .description("Project Example Contains Portfolio App APIs")
                        .version("1.0"));
    }
}
