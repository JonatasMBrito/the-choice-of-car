package br.com.jonatasmbrito.thechoiceofcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class TheChoiceOfCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheChoiceOfCarApplication.class, args);
	}

}
