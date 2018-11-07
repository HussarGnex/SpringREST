package cloud.marciniak.rest;

import cloud.marciniak.rest.models.Employee;
import cloud.marciniak.rest.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Magda", "Student")));
            log.info("Preloading " + repository.save(new Employee("Michał", "Programmer/Student")));
        };
    }
}
