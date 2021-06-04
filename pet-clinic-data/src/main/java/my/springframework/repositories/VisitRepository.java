package my.springframework.repositories;

import my.springframework.petclinicapp.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
