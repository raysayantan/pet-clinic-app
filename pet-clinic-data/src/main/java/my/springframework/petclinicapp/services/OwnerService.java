package my.springframework.petclinicapp.services;

import my.springframework.petclinicapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
