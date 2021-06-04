package my.springframework.bootstrap;

import my.springframework.petclinicapp.model.*;
import my.springframework.petclinicapp.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;
    private final PetService petService;

    DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService, PetService petService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
        this.petService = petService;
    }
    @Override
    public void run(String... args) throws Exception {
        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        Speciality speciality = new Speciality();
        speciality.setDescription("Test Speciality");
        specialityService.save(speciality);

        Pet cat1 = new Pet();
        cat1.setName("Cat1");
        cat1.setBirthDate(LocalDate.now());
        cat1.setPetType(cat);

        Set<Pet> pets = new HashSet<>();
        pets.add(cat1);

        Visit catVisit = new Visit();
        catVisit.setPet(cat1);
        catVisit.setDescription("tets desc");
        catVisit.setDate(LocalDate.now());

        Set<Visit> visits = new HashSet<>();
        visits.add(catVisit);
        cat1.setVisits(visits);

        Owner owner1 = new Owner();
        owner1.setFirstName("AAA");
        owner1.setLastName("aaa");
        owner1.setPets(pets);
        ownerService.save(owner1);
        cat1.setOwner(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("BBB");
        owner2.setLastName("bbb");

        ownerService.save(owner2);

        System.out.println("Loaded Owner...");

        Vet vet1 = new Vet();
        vet1.setFirstName("CCC");
        vet1.setLastName("ccc");
        Set<Speciality> specilities = new HashSet<>();
        specilities.add(speciality);
        vet1.setSpecilities(specilities);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("DDD");
        vet2.setLastName("ddd");

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("EEE");
        vet3.setLastName("eee");

        vetService.save(vet3);
        System.out.println("Loaded vet...");

        visitService.save(catVisit);
        petService.save(cat1);
    }
}
