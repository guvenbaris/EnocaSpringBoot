package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class PersonController {

    @GetMapping("/person")
    public List<Person> getAllPersons(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"Tony Montanna",30,5000));
        personList.add(new Person(2,"Vito Corleone",65,100000));
        personList.add(new Person(3,"Marlon Brando",50,10000));
        return personList;
    }
    @GetMapping("/person/{personId}")
    public Person getPersonWithId(@PathVariable Integer personId){
        //Returns hardcoded data, a real world application would return from the database
        return new Person(3,"Marlon Brando",50,10000);
    }
    @PostMapping("/person/newperson")
    public void addPerson(@RequestBody Person person){
        System.out.println("Save person information to database");
    }
    @PutMapping("/person/{personId}}")
    public Person putPersonWithId(@RequestBody Person person ,@PathVariable Integer personId) {
        Person oldPerson = getPersonWithId(personId);
        oldPerson.setAge(25);
        oldPerson.setBalance(10000);
        oldPerson.setName("Christian");
        return oldPerson;
    }
    @DeleteMapping("/person/{personId}")
    public  Person deletePersonWithId(@PathVariable Integer personId){
        Person deletePerson = getPersonWithId(personId);
        System.out.println("Person is deleted");
        return deletePerson;
    }
}
