package rhorbovyi.nameservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NameServiceApplication {

	@Value("${messages.name}")
	private String name;

	@GetMapping("/name/{userId}")
	public String getName(@PathVariable("userId") String userId) {
		return name;
	}

	public static void main(String[] args) {
		SpringApplication.run(NameServiceApplication.class, args);
	}

}
