package co.develhope.Esercizio12CRUD.controllers;

import co.develhope.Esercizio12CRUD.entities.Car;
import co.develhope.Esercizio12CRUD.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarRepository carRepository;

    public CarController(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @PostMapping ("/create")
    public Car createNewCar(@RequestBody Car car) {
       return carRepository.save(car);

    }

    @GetMapping ("/showCars")
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping ("/car/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        Optional <Car> optionalCar = carRepository.findById(id);
        return optionalCar.map(ResponseEntity :: ok).orElseThrow(RuntimeException :: new);
    }

    @PutMapping ("/update/{id}")
    public ResponseEntity <Car> updateCarType(@PathVariable Long id, @RequestParam String type) {
        Optional <Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            Car car = optionalCar.get();
            car.setType(type);
            carRepository.save(car);
            return ResponseEntity.ok(car);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity <Void> deleteCarById(@PathVariable Long id) {
        Optional <Car> optionalCar = carRepository.findById(id);
        if(optionalCar.isPresent()){
            carRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @DeleteMapping ("/deleteAll")
    public ResponseEntity <Void> deleteAllCars(){
        carRepository.deleteAll();
        return ResponseEntity.ok().build();
    }


}
