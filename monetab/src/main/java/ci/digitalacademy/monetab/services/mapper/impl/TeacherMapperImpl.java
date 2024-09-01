package ci.digitalacademy.monetab.services.mapper.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TeacherMapperImpl {

    private final ModelMapper modelMapper;

    public TeacherDTO toDto(Teacher entity) {
        return modelMapper.map(entity, TeacherDTO.class);
    }

    public Teacher toEntity(TeacherDTO dto) {
        return modelMapper.map(dto, Teacher.class);
    }
}
