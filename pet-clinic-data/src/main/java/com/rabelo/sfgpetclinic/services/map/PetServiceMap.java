package com.rabelo.sfgpetclinic.services.map;

import com.rabelo.sfgpetclinic.model.Pet;
import com.rabelo.sfgpetclinic.services.CrudService;
import com.rabelo.sfgpetclinic.services.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
}
