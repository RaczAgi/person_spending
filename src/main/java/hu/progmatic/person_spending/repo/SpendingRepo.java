package hu.progmatic.person_spending.repo;

import hu.progmatic.person_spending.model.Spending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpendingRepo extends JpaRepository<Spending, Long> {
}
