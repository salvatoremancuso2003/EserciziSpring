package eserciziSpring.esercizio05.controllers;

import eserciziSpring.esercizio05.entities.CarDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @GetMapping(value = "/car")
    public String getNewCar (@RequestParam String id, @RequestParam String modelname, @RequestParam Double price){
        CarDTO newCar = new CarDTO(id, modelname, price);
        return newCar.toString();
    }
    @PostMapping (value = "/car")
    public String getCarBody(@Valid @RequestBody(required = true) CarDTO carDTO){
        return carDTO.toString();
    }

}
