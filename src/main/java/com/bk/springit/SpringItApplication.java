package com.bk.springit;


import com.bk.springit.domain.Comment;
import com.bk.springit.domain.Link;
import com.bk.springit.repository.CommentRepository;
import com.bk.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringItApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringItApplication.class, args);
	}


	@Bean
	CommandLineRunner runLoadDatabase(LinkRepository linkRepository, CommentRepository commentRepository)
	{
		return args -> {
			System.out.println("Load Database");
			Link link = new Link("Command Runner in Spring Boot","https://docs.spring.io/spring-boot/docs/2.1.0.M1/reference/html/howto-database-initialization.html");
			linkRepository.save(link);

			Comment comment = new Comment(
					"Learning spring",
					link
			);
			commentRepository.save(comment);
			link.addComment(comment);

		};
	}
}
