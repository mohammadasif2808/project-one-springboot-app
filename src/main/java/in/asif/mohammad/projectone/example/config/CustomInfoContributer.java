package in.asif.mohammad.projectone.example.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomInfoContributer implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Object> customDetails = new HashMap<>();
        customDetails.put("Application Name", "Project one example for portfolio APIs Microservice");
        customDetails.put("version", "1.0.0");
        customDetails.put("Application Owner", "Mohammad Asif");
        customDetails.put("email", "mohammadasif2808@gmail.com");
        LocalDateTime deploymentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        customDetails.put("deploymentTime", deploymentTime.format(formatter));
        customDetails.put("environment", "Development");

        Map<String, Object> endpoints = new HashMap<>();
        endpoints.put("health", "http://mohammadasif.co.in:8080/admin/healthCheck");
        endpoints.put("info", "http://mohammadasif.co.in:8080/admin/applicationInfo");
        endpoints.put("metrics", "http://mohammadasif.co.in:8080/actuator/metrics");
        customDetails.put("endpoints", endpoints);

        builder.withDetail("customInfo", customDetails).build();
    }
}