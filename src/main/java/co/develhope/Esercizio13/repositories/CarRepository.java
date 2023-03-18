package co.develhope.Esercizio13.repositories;

import co.develhope.Esercizio13.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository <Car, Long> {
}
