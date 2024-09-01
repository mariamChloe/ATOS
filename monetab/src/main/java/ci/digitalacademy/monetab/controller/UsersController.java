package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    @GetMapping
    public String ShowUserPage(){
        return "/users/add";
    }
    @GetMapping("/update")
    public String ShowUpdatePage(){
        return "/users/update";
    }

    @PostMapping("/add")
    public String addUser(
            @RequestParam("pseudo") String pseudo,
            @RequestParam("password") String password) {

        // Check for password confirmation here if needed

        User user = new User();
        user.setPseudo(pseudo);
        user.setPassword(password);

        userService.save(user);

        return "redirect:/users"; // Redirect to a success page or list of users
    }

}
