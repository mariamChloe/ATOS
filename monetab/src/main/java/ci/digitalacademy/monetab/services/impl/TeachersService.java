package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class TeachersService implements TeacherService {

    private final TeacherRepository teacherRepository; // Inject the repository
    private final TeacherMapper teacherMapper;

    @Override
    public List<TeacherDTO> findAll() {
        // Fetch all teachers from the repository and convert to DTOs
        return teacherRepository.findAll().stream()
                .map(teacherMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        // Find teacher by ID and convert to DTO
        return teacherRepository.findById(id)
                .map(teacherMapper::toDTO);
    }

    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        // Convert DTO to entity
        Teacher teacher = teacherMapper.toEntity(teacherDTO);
        // Save the updated teacher and convert back to DTO
        Teacher updatedTeacher = teacherRepository.save(teacher);
        return teacherMapper.toDTO(updatedTeacher);
    }

    @Override
    public TeacherDTO save(Teacher teacherDTO) {
        return null;
    }

    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        // Convert DTO to entity
        Teacher teacher = teacherMapper.toEntity(teacherDTO);
        // Save the new teacher and convert back to DTO
        Teacher savedTeacher = teacherRepository.save(teacher);
        return teacherMapper.toDTO(savedTeacher);
    }

    @Override
    public void delete(Long id) {
        // Delete teacher by ID
        teacherRepository.deleteById(id);
    }

    @Override
    public void deleteTeacherById(Long id) {
        // Call the delete method
        delete(id);
    }
}
