package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
@Inheritance(strategy = InheritanceType.JOINED )// l'heritage pour pouvoir lier la classe parente au classe enfant
@Setter
@Getter
@NoArgsConstructor
@Entity
//@DiscriminatorColumn(name="persone_type") //PERMET DE SAVOIR LE TYPE D OBJET DANS LA TABLE COLONNE
@Table(name="persone")
public  abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nom", unique = false,nullable = true)
    private String nom;
    @Column(name="prenom", unique=false,nullable = true)
    private String prenom;
    @Column(name="ville",unique=false,nullable = true)
    private String ville;
    @Column(name="telephone",unique = true,nullable = true)
    private String telephone;
    @Column(name="dateDeNaissance",unique = false,nullable = true)
    private String dateDeNaissaince;
    @Column(name="email",unique = false,nullable = true)
    private String email;
    @Column(name="genre",unique = false,nullable = true)
    private String genre;



}
