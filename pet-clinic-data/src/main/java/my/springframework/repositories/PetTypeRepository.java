package my.springframework.repositories;

import my.springframework.petclinicapp.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
