package com.example.homework12.repository;

import com.example.homework12.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByName(String personName);
    Person findByAge(int personAge);
}
