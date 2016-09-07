package com.rhqiq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ContactRepository repository;

    @Autowired
    public DatabaseLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Contact("Reza", "reza@gmail.com", "Software Developer"));
        this.repository.save(new Contact("Nooshin", "noosh@gmail.com", "Accountant"));
        this.repository.save(new Contact("Jeff", "jeff@gmail.com", "Mechanic"));
    }
}