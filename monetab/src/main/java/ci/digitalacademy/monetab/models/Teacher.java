package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value="teacher") //permet d'intergrer des valeur

public class Teacher extends Personne {

    @Column(name = "matiere", nullable = true)
    private String matiere;

    @Column(name = "vacant", nullable = true)
    private Boolean vacant;

    @Column(name = "prochain_cours", nullable = true)
    private String prochainCours;

    @Column(name = "sujet_prochaine_reunion", nullable = true)
    private String sujetProchaineReunion;
}
