package com.example.homework12.patterns.strategy;

import com.example.homework12.model.Person;
import com.example.homework12.repository.PersonRepository;

public class AgeSearchStrategy implements PersonSearchStrategy{
    private int personAge;

    public AgeSearchStrategy(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public Person searchPerson(Long id, PersonRepository personRepository) {
        return personRepository.findByAge(personAge);
    }
}
