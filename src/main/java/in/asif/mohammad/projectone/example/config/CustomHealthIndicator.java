package in.asif.mohammad.projectone.example.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // Check the health of your component here
        boolean isHealthy = true;

        if (isHealthy) {
            String customMessage = "Project one example for portfolio APIs microservice is up and running smoothly!";
            return Health.up().withDetail("message", customMessage).build();
        } else {
            return Health.down().withDetail("Project one example for portfolio APIs", "Not available").build();
        }
    }
}