package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue(value="student") //permet d'intergrer des valeur
public class Student extends Personne {

    @Column(name="matricule",unique = true,nullable = true)
    private String matricule;
    @Column(name="clase",unique=true,nullable=true)
    private String classe;



}
