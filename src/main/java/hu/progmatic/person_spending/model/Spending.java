package hu.progmatic.person_spending.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Spending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String where_spent;
    private Integer howmuch_spent;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonManagedReference
    private Person person;
}
