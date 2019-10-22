package es.tallercan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TallercanApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallercanApplication.class, args);
	}

}
