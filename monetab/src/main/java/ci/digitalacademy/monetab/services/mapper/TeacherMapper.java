package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    private TeacherMapper() {}

    // Convert Teacher entity to TeacherDTO
    public TeacherDTO toDTO(Teacher teacher) {

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setVacant(teacher.getVacant());
        teacherDTO.setProchainCours(teacher.getProchainCours());
        teacherDTO.setSujetProchaineReunion(teacher.getSujetProchaineReunion());

        return teacherDTO;
    }

    // Convert TeacherDTO to Teacher entity
    public Teacher toEntity(TeacherDTO teacherDTO){

        Teacher teacher = new Teacher();
        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setVacant(teacherDTO.getVacant());
        teacher.setProchainCours(teacherDTO.getProchainCours());
        teacher.setSujetProchaineReunion(teacherDTO.getSujetProchaineReunion());

        return teacher;
    }


}
