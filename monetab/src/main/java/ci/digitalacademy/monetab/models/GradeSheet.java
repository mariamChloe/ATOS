package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="grade_sheet")
public class GradeSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float note;
    private String year;
    //@ManyToOne(fetch= FetchType.LAZY)
    //@JoinColumn Accountant account;
}
