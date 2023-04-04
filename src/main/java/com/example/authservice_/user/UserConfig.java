package com.example.authservice_.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MAY;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User islichinga = new User(
                    "Ismaili1995",
                    "Ismaili",
                    "Lichinga",
                    "ismaili@gmail.com",
                    763080423,
                    LocalDate.of(1995, MAY, 4),
                    "Buolamwini1995");
            User halima = new User(
                    "Halima995",
                    "Halima",
                    "Lichinga",
                    "halima@gmail.com",
                    763080423,
                    LocalDate.of(1998, MAY, 4),
                    "Buolamwini1995");
            repository.saveAll(
                    List.of(islichinga, halima)
            );

        };
    }
}
