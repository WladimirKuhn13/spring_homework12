package com.example.homework12.patterns.strategy;

import com.example.homework12.model.Person;
import com.example.homework12.repository.PersonRepository;

public interface PersonSearchStrategy {
    Person searchPerson(Long id, PersonRepository personRepository);
}
