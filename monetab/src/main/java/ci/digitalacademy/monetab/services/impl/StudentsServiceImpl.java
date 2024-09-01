package ci.digitalacademy.monetab.services.impl;
import ci.digitalacademy.monetab.repositories.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.StudentService;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class StudentsServiceImpl implements StudentService {
    private final StudentsRepository studentsRepository;


    @Override
    public Student save(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentsRepository.save(student);


    }

    @Override
    public Optional<Student> findOne(Long id) {
        return studentsRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentsRepository.findAll();

    }

    @Override
    public void delecte(Long id) {

    }


    @Override
    public void delete(Long id) {
        studentsRepository.deleteById(id);


    }

    @Override
    public void saveStudent(Student student) {

    }
}

