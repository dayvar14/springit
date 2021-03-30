package com.ayvar.springit;

import com.ayvar.springit.domain.Comment;
import com.ayvar.springit.domain.Link;
import com.ayvar.springit.repository.CommentRepository;
import com.ayvar.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Springit!");
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args -> {
          Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
          linkRepository.save(link);
          Comment comment = new Comment("This course is awesome", link);
          commentRepository.save(comment);
          link.addComment(comment);

          Link firstLink = linkRepository.findByTitle("Getting Started with Spring Boot 2");
          System.out.println(firstLink.getTitle());

        };
    }
}
