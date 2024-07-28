package in.asif.mohammad.projectone.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
@RequestMapping("/api")
class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World! Welcome to my first spring boot mircroservice.";
	}
}
