package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {


}
