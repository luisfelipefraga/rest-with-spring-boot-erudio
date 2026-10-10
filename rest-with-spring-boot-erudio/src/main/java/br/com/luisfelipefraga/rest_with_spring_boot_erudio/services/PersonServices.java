package br.com.luisfelipefraga.rest_with_spring_boot_erudio.services;

import br.com.luisfelipefraga.rest_with_spring_boot_erudio.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = LoggerFactory.getLogger(PersonServices.class.getName());

    public List<Person> findAll(){
        var persons = new ArrayList<Person>();
        logger.info("Finding all People");
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Firstname " + i);
        person.setLastName("Lastname " + i);
        person.setAddress("Some address in brasil");
        person.setGender("Male");
        return person;
    }

    public Person findById(String id){
        logger.info("Finding one person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Luís Felipe");
        person.setLastName("Fraga");
        person.setAddress("Blumenau - Santa Catarina - Brasil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){
        logger.info("Creating one person");

        return person;
    }

    public Person update(Person person){
        logger.info("Updating one person");

        return person;
    }

    public void delete(String id){
        logger.info("Deleting one person");

    }

}
