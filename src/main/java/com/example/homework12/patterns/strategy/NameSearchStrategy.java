package com.example.homework12.patterns.strategy;

import com.example.homework12.model.Person;
import com.example.homework12.repository.PersonRepository;

public class NameSearchStrategy implements PersonSearchStrategy {

    private String personName;

    public NameSearchStrategy(String personName) {
        this.personName = personName;
    }

    @Override
    public Person searchPerson(Long id, PersonRepository personRepository) {
        return personRepository.findByName(personName);
    }
}
