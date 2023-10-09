package hu.progmatic.person_spending.service;

import hu.progmatic.person_spending.model.Person;
import hu.progmatic.person_spending.repo.PersonRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {
    private final List<Person> persons = new ArrayList<>();
    private PersonRepo personRepo;

    public Person addNewPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getAllPerson() {
        return personRepo.findAll();
    }

    public Person searchPersonById(Long id) {
        for (var actual : persons){
            if (id == actual.getId()){
                return actual;
            }
        } return null;

    }
}
