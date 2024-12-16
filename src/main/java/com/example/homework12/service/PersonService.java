package com.example.homework12.service;

import com.example.homework12.model.Person;
import com.example.homework12.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
