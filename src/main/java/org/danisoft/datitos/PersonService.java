package org.danisoft.datitos;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public String getPersonName() {
        return repository.findById(1L).map(Person::getName).orElseThrow(() -> new RuntimeException("oops, no such person"));
    }
}
