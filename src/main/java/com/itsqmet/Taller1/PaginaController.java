package com.itsqmet.Taller1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
@GetMapping ("/index")
    public String index(){
    return "index";
}
    @GetMapping ("/home")
    public String home(){
        return "home";
    }
    @GetMapping ("/peliculas")
    public String peliculas (){
    return "peliculas";
    }
    @GetMapping ("/login")
    public String login(){
    return "login";
    }
}
