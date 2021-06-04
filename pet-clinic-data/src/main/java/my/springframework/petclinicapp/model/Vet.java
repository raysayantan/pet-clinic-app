package my.springframework.petclinicapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specilities = new HashSet<>();

    public Set<Speciality> getSpecilities() {
        return specilities;
    }

    public void setSpecilities(Set<Speciality> specilities) {
        this.specilities = specilities;
    }
}
