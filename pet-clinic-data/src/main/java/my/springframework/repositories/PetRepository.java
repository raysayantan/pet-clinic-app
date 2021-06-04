package my.springframework.repositories;

import my.springframework.petclinicapp.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
