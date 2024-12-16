package com.example.homework12.patterns.decorator;

import com.example.homework12.model.Person;

import java.util.List;

public class PersonServiceWithLogging implements ServiceInterface{

    private final ServiceInterface serviceInterface;

    public PersonServiceWithLogging(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @Override
    public Person findById(Long id) {
        System.out.println("Лог выполнения метода FindById, искомый id: " + id);
        return serviceInterface.findById(id);
    }

    @Override
    public List<Person> findAll() {
        System.out.println("Лог выполнения метода FindAll");
        return serviceInterface.findAll();
    }

    @Override
    public Person savePerson(Person person) {
        System.out.println("Лог выполнения метода SavePerson, сохраняемый объект: " + person);
        return serviceInterface.savePerson(person);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("Лог выполнения метода DeleteById, id для удаления: " + id);
    }
}
