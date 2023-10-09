package hu.progmatic.person_spending.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthplace;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth_time;
    private String email;
    @OneToMany(mappedBy = "person")
    @JsonBackReference
    private List<Spending> spendingList = new ArrayList<>();


}
