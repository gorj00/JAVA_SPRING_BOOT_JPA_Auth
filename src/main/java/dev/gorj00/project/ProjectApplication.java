package dev.gorj00.project;

import dev.gorj00.project.model.Post;
import dev.gorj00.project.model.User;
import dev.gorj00.project.repository.PostRepository;
import dev.gorj00.project.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository postsRepo,
                                        UserRepository usersRepo) {
        // runs after application context is created and before main runs
        return args -> {
            usersRepo.save(new User("user", "user", "ROLE_USER"));
            usersRepo.save(new User("admin", "admin", "ROLE_USER,ROLE_ADMIN"));
            postsRepo.save(new Post("Hello World", "hello-world", "Welcome to" +
                    " my blog", "J.K.Rowling"));
        };
    }

}
