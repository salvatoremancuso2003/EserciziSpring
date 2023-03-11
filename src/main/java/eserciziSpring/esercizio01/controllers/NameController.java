package eserciziSpring.esercizio01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/Salvatore")
    public String getName(){
        return "Salvatore";
    }

    @PostMapping("/Salvatore")
    public String getReversedName(){
        StringBuilder stringBuilder = new StringBuilder("Salvatore");
        return stringBuilder.reverse().toString();
    }
}
