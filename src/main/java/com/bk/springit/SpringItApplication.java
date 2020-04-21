package com.bk.springit;

import com.bk.springit.config.SpringProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringProperties.class)
public class SpringItApplication {

	@Autowired
	private SpringProperties springProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringItApplication.class, args);
	}

	@Bean
	CommandLineRunner runner()
	{
		return args -> System.out.println(springProperties.getWelcomMsg());
	}

}
