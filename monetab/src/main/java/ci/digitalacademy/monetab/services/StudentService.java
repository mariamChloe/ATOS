package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface StudentService {


    List<Student> findAll();



    Student save(Student student);

    Student update(Student student);

    Optional<Student> findOne(Long id);


    void delecte(Long id);

    void delete(Long id);

    void saveStudent(Student student);
}
