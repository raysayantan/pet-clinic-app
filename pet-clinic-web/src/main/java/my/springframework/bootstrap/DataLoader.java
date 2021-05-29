package my.springframework.bootstrap;

import my.springframework.petclinicapp.model.Owner;
import my.springframework.petclinicapp.model.Vet;
import my.springframework.petclinicapp.services.OwnerService;
import my.springframework.petclinicapp.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("AAA");
        owner1.setLastName("aaa");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("BBB");
        owner2.setLastName("bbb");

        ownerService.save(owner2);

        System.out.println("Loaded Owner...");

        Vet vet1 = new Vet();
        vet1.setFirstName("CCC");
        vet1.setLastName("ccc");

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
    }
}
