package com.rabelo.sfgpetclinic.bootstrap;

import com.rabelo.sfgpetclinic.model.Owner;
import com.rabelo.sfgpetclinic.model.Vet;
import com.rabelo.sfgpetclinic.services.OwnerService;
import com.rabelo.sfgpetclinic.services.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(DataInitializer.class);

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataInitializer(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Gabriel");
		owner1.setLastName("Rabelo");

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Juju");
		owner2.setLastName("Vovó");

		ownerService.save(owner1);
		ownerService.save(owner2);

		LOGGER.debug("Loaded the owners...");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Pant");
		vet1.setLastName("era");

		Vet vet2 = new Vet();
		vet2.setId(2L);


		vet2.setFirstName("La");
		vet2.setLastName("na");

		vetService.save(vet1);
		vetService.save(vet2);

		LOGGER.debug("Loaded the vets...");
	}
}
