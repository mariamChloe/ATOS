package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    List<TeacherDTO> findAll();

    Optional<TeacherDTO> findOne(Long id);

    TeacherDTO save(TeacherDTO teacherDTO);

    TeacherDTO update(TeacherDTO teacherDTO);

    TeacherDTO save(Teacher teacherDTO);

    void delete(Long id);

    void deleteTeacherById(Long id);
}
