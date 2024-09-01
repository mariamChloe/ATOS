package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.StudentService; // Correct interface import
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class MonetabApplication implements CommandLineRunner {

	private final TeacherService teacherService; // Ensure this is the correct service interface
	private final StudentService studentsService; // Corrected to match the service interface name

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Teacher teacher = new Teacher();
		teacher.setVacant(true);
		teacher.setMatiere("Mathematique");
		teacher.setSujetProchaineReunion("Devoir de Math");
		teacher.setProchainCours("Alogrithme");
		teacher.setDateDeNaissaince("08/02/1980");
		teacher.setEmail("teacher@gmail.com");
		teacher.setTelephone("0102030405");
		teacher.setNom("kouakou");
		teacher.setPrenom("Yao");
		teacher.setVille("Abidjan");
		teacher.setGenre("Homme");

		teacherService.save(teacher); // Save teacher object

		Teacher teacher1 = new Teacher();
		teacher1.setVacant(true);
		teacher1.setMatiere("Informatique");
		teacher1.setSujetProchaineReunion("java");
		teacher1.setProchainCours("springBoot");
		teacher1.setDateDeNaissaince("07/03/1981");
		teacher1.setEmail("directeur@gmail.com");
		teacher1.setTelephone("0203040406");
		teacher1.setNom("piere");
		teacher1.setPrenom("kouassi");
		teacher1.setVille("Bouake");
		teacher1.setGenre("Femme");

		teacherService.save(teacher1); // Save second teacher object

		Student students = new Student();
		students.setNom("traore");
		students.setMatricule("AB2024");
		students.setEmail("studentbrillant@gmail.com");
		students.setPrenom("Mariam");
		students.setClasse("terminale");
		students.setTelephone("0710004659");
		students.setDateDeNaissaince("07/02/2000");
		students.setGenre("FEMME");

		students.setVille("Abidjan");
		studentsService.save(students); // Save student object
	}
}
