package com.devops.test.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student = new Student(
                    1L, "othmane", "toto", "otozy@gmail.com", 24
            );

            Student std = new Student(
                    445L, "titi", "toto", "toti@gmail.com", 12
            );

            Student std1 = new Student(
                    1L, "othmane", "toto", "otozy@gmail.com", 24
            );

            repository.saveAll(
                    List.of(student, std, std1)
            );
        };
    }
}
