package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller//permet de dire a l'app que cette class est un controller
@RequestMapping("/auth")//PERMET DE MAPPER LES URL DEFINIR DANS LA CLASS
public class AuthController {

    @GetMapping
    public String ShowLoginPage(){

        return "auth/login";
    }
    @GetMapping("/login")
    public String logout() {
        // Logique de déconnexion
        return "auth/login";
    }



}

