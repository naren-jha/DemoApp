package com.njha.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        Student joe = Student
                .builder()
                .name("Joe Goldberg")
                .email("joeg@gmail.com")
                .age(25)
                .dob(LocalDate.of(2001, Month.JUNE, 20))
                .build();

        Student love = Student
                .builder()
                .name("Love Quinn")
                .email("loveq@gmail.com")
                .age(22)
                .dob(LocalDate.of(2002, Month.JUNE, 20))
                .build();

        return args -> {
            studentRepository.saveAll(List.of(joe, love));
        };
    }
}
