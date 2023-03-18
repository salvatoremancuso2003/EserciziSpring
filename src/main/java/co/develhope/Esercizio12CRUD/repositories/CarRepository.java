package co.develhope.Esercizio12CRUD.repositories;

import co.develhope.Esercizio12CRUD.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car, Long> {
}
