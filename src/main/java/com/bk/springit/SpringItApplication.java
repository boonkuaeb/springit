package com.bk.springit;

import com.bk.springit.config.SpringProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(SpringProperties.class)
public class SpringItApplication {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private SpringProperties springProperties;

	private static final Logger log = LoggerFactory.getLogger(SpringItApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringItApplication.class, args);
	}

	@Bean
	CommandLineRunner runner()
	{
		return args ->
			System.out.println(springProperties.getWelcomMsg());
	}
	@Bean
	@Profile("dev")
	CommandLineRunner runnerDev()
	{
		return args -> System.out.println("This is running that we would only do in Dev");
	}

	@Bean
	CommandLineRunner runnerBean()
	{
		return args -> {
			System.out.println("Printttt out all bean names in the application context.");
			System.out.println("-------------------------------------------------------");
			String[] beans = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);
			for (String bean: beans)
			{
				System.out.println(bean);
			}

			log.error("CommandLineRunner.run();");
			log.warn("CommandLineRunner.run();");
			log.info("CommandLineRunner.run();");
			log.debug("CommandLineRunner.run();");
			log.trace("CommandLineRunner.run();");

		};
	}
}
