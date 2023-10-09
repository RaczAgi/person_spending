package hu.progmatic.person_spending.service;

import hu.progmatic.person_spending.model.Person;
import hu.progmatic.person_spending.model.Spending;
import hu.progmatic.person_spending.repo.SpendingRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SpendingService {
    private SpendingRepo spendingRepo;

    public Spending addNewSpending(Spending spending) {
        return spendingRepo.save(spending);
    }

    public List<Spending> getAllSpending() {
        return spendingRepo.findAll();
    }
}
