package eserciziSpring.esercizio03.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/Strings")
    public String concatenatedStrings(@RequestParam String firstString, @RequestParam(required = false) String secondString){
        if (secondString != null){
            return firstString + " " + secondString;
        }else{
            return firstString;
        }
    }
}
