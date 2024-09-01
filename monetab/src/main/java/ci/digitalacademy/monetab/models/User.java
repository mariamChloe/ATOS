package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = false, nullable = true)
    private String username; // Correction du nom de la variable

    @Column(name = "password", nullable = true)
    private String password;

    @Column(name = "create_date", nullable = true)
    private Instant createDate; // Correction du nom de la variable pour correspondre à la convention de base de données


    public Long getSpeudo() {
        Long pseudo = null;
        return pseudo;
    }


    public void setPseudo(String pseudo) {
    }
}
