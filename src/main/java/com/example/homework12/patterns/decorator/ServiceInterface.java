package com.example.homework12.patterns.decorator;

import com.example.homework12.model.Person;

import java.util.List;

public interface ServiceInterface {
    Person findById(Long id);
    List<Person> findAll();
    Person savePerson(Person person);
    void deleteById(Long id);
}
