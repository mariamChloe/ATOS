package ci.digitalacademy.monetab.services.mapper.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.dto.UserDTO;

public interface TeacherMapper extends EntityMapper<TeacherDTO, Teacher> {
    Teacher toDto(User entity);

    Teacher toEntity(UserDTO dto);

    Teacher toDto(Teacher entity);

    Teacher toEntity(Teacher dto);
}
