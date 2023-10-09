package hu.progmatic.person_spending.contoller;

import hu.progmatic.person_spending.model.Person;
import hu.progmatic.person_spending.model.Spending;
import hu.progmatic.person_spending.service.PersonService;
import hu.progmatic.person_spending.service.SpendingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SpendingController {
    private SpendingService spendingService;

    @GetMapping("/spendings")
    public String getAllSpending(Model model) {
        model.addAttribute("spendings", spendingService.getAllSpending());
        return "spendings";
    }

    @GetMapping("/addSpending")
    public String addNewSpending(Model model) {
        model.addAttribute("newSpending", new Spending());
        return "addSpending";
    }

    @PostMapping("/addSpending")
    public String addNewSpending(@ModelAttribute("newSpending") Spending newSpending) {
        spendingService.addNewSpending(newSpending);
        return "redirect:/spendings";
    }
}
