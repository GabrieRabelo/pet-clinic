package com.rabelo.sfgpetclinic.services;

import com.rabelo.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

	Vet findById();

	Vet save(Vet vet);

	Set<Vet> findAll();
}
