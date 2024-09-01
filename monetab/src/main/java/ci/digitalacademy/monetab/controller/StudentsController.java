package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor

@RequestMapping("/students")
public class StudentsController {
    private final StudentService studentsService; // Corrected to match the service interface name


@GetMapping

    public String showStudentList(Model model) {
        List<Student> students = studentsService.findAll(); // Make sure this method exists
        model.addAttribute("students", students);
        return "students/list"; // This should match your template name
    }
    @GetMapping("/update-student/{id}")
    public String showUpdateStudent(Model model, @PathVariable Long id){

        Optional<Student> student = studentsService.findOne(id);
        if (student.isPresent()){
            model.addAttribute("student" , student.get());
            return "/students/forms";
        } else {
            return "redirect:/students";
        }

    }

    @GetMapping("/forms")
    public String showFormsPage(){

        return "/students/forms" ;
    }
    @GetMapping("/add")
    public String addStudent(Student student) {
        studentsService.saveStudent(student); // Save the student to the database
        return "redirect:/students"; // Redirect to the list of students after adding
    }


}
