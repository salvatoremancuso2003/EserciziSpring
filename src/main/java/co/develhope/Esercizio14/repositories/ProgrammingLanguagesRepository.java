package co.develhope.Esercizio14.repositories;

import co.develhope.Esercizio14.entities.ProgrammingLanguages;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Simple description for the exercise"))
public interface ProgrammingLanguagesRepository extends PagingAndSortingRepository<ProgrammingLanguages, Long> {
}
