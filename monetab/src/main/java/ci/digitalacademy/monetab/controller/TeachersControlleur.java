package ci.digitalacademy.monetab.controller;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.mapper.TeacherMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/teachers")
@RequiredArgsConstructor
@Slf4j
public class TeachersControlleur {

private final TeacherService teacherService;

    @GetMapping
    public String showTeacher(Model model) {
        List<TeacherDTO> teachers = teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "teachers/list";
    }

    @GetMapping("/show_add_Teacher_form")
    public String showAddTeachers(Model model) {
        log.debug("Request to show add teacher forms");
        model.addAttribute("teacher", new TeacherDTO());
        return "/teachers/forms";
    }

    @PostMapping
    public String saveTeacher(TeacherDTO teacherDTO) {
        log.debug("Request to save teacher: {}");
        teacherService.save(teacherDTO);
        return "redirect:/teachers";
    }

    @GetMapping("/update-teacher/{id}")
    public String showUpdateTeacher(Model model, @PathVariable Long id) {
        log.debug("Request to show update teacher forms");
        Optional<TeacherDTO> teacherDTO = teacherService.findOne(id);
        if (teacherDTO.isPresent()) {
            model.addAttribute("teacher");
            return "/teachers/forms";
        } else {
            return "redirect:/teachers";
        }
    }

    @PostMapping("/delete-teacher/{id}")
    public String deleteTeacher(@PathVariable Long id, Model model) {
        Optional<TeacherDTO> teacherDTO = teacherService.findOne(id); // Fetch teacher by ID

        if (teacherDTO.isPresent()) {
            // If teacher exists, delete and redirect to the teachers list
            teacherService.deleteTeacherById(id);
            return "redirect:/teachers"; // Optionally, add a success message attribute to the model
        } else {
            // Teacher does not exist, you could add an error message to the model
            model.addAttribute("error", "Teacher not found");
            return "redirect:/teachers"; // Redirect back to the list with an error message
        }
    }




}
