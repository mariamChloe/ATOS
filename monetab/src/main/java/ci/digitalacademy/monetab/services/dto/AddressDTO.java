package ci.digitalacademy.monetab.services.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class AddressDTO {
    private Long id;
    private String country;
    private String city;
    private String Street;

    public AddressDTO() {

    }

    public void SetId(Long id) {
    }

    public void SetCity(String city) {
    }

    public void SetStreet(String street) {
    }

    public void SetCountry(String country) {
    }
}



