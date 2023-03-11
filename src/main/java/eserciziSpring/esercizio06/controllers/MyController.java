package eserciziSpring.esercizio06.controllers;

import eserciziSpring.esercizio06.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("My controller constructor has been called");
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println(" myController.getName() has been called ");
        return myService.getName();
    }
    @GetMapping("/")
    public String sayWelcome(){
        return "Welcome";
    }
}
