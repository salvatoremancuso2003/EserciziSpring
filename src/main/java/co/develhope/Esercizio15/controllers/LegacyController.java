package co.develhope.Esercizio15.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacy(){
        return "This is just a old code";
    }
}
