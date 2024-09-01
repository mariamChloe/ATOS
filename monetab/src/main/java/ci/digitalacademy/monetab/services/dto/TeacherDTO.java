package ci.digitalacademy.monetab.services.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO {

    private String matiere;
    private Boolean vacant;
    private String prochainCours;
    private String sujetProchaineReunion;

}
