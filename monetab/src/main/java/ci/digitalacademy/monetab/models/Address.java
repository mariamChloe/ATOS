package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "country", unique = false, nullable = true)

    private String country;
    @Column(name = "city", unique = false, nullable = true)

    private String city;
    @Column(name = "street", unique = false, nullable = true)
    private String Street;

    public void SetId(Long id) {
    }

    public void SetCity(String city) {
    }

    public void SetStreet(String street) {
    }

    public void SetCountry(String country) {
    }

    public void setCountry(String country) {
    }

    public void setCity(String city) {
    }
}
