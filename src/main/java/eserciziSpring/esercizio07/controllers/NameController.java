package eserciziSpring.esercizio07.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NameController {

    @GetMapping(value = "")
    public String sayWelcome(){
        return "Welcome!";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "Salvatore";
    }
}

