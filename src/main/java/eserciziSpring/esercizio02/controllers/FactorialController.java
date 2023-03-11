package eserciziSpring.esercizio02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/Factorial/{n}")
    public Integer getN(@PathVariable Integer n){
        Integer Factorial = 1;
        for (int i = 1; i <= n; i ++) {
            Factorial *= i;
        }
        return Factorial;

    }}

