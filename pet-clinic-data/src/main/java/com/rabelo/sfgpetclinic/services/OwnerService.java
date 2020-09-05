package com.rabelo.sfgpetclinic.services;

import com.rabelo.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById();

	Owner save(Owner owner);

	Set<Owner> findAll();
}
