package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return  args -> {
          Student  marien = new Student("Marien","marien@smirltech.com", LocalDate.of(2000, Month.FEBRUARY,23));

          Student jonas =  new Student("Jonas","marien@smirltech.com", LocalDate.of(2000, Month.FEBRUARY,23));

            repository.saveAll(
                    List.of(marien,jonas)
            );
        };
    }
}
