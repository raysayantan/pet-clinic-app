package my.springframework.bootstrap;

import my.springframework.petclinicapp.model.Owner;
import my.springframework.petclinicapp.model.Vet;
import my.springframework.petclinicapp.services.OwnerService;
import my.springframework.petclinicapp.services.VetService;
import my.springframework.petclinicapp.services.map.OwnerServiceMap;
import my.springframework.petclinicapp.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("AAA");
        owner1.setLastName("aaa");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner1.setFirstName("BBB");
        owner1.setLastName("bbb");

        ownerService.save(owner2);

        System.out.println("Loaded Owner...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("CCC");
        vet1.setLastName("ccc");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("DDD");
        vet2.setLastName("ddd");

        vetService.save(vet2);
    }
}
