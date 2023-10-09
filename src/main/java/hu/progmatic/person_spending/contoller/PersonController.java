package hu.progmatic.person_spending.contoller;

import hu.progmatic.person_spending.model.Person;
import hu.progmatic.person_spending.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@AllArgsConstructor
public class PersonController {
    private PersonService personService;
    @GetMapping("/persons")
    public String getAllGuests(Model model) {
        model.addAttribute("guests", personService.getAllPerson());
        return "persons";
    }

    @GetMapping("/addPerson")
    public String addNewPerson(Model model) {
        model.addAttribute("newPerson", new Person());
        return "addPerson";
    }

    @PostMapping("/addPerson")
    public String addNewPerson(@ModelAttribute("newPerson") Person newPerson) {
        personService.addNewPerson(newPerson);
        return "redirect:/persons";
    }

    @GetMapping("/searchPerson")
    public String searchPersonById(){
        return "searchPerson";
    }

    @PostMapping("/searchPerson")
    public String searchPersonById(@RequestParam("id") Long id) {
        personService.searchPersonById(id);
        return "redirect:/persons";
    }
}
