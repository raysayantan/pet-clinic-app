package my.springframework.petclinicapp.services;

import my.springframework.petclinicapp.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
