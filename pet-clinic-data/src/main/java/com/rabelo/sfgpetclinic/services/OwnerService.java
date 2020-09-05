package com.rabelo.sfgpetclinic.services;

import com.rabelo.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
