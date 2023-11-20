package com.miempresa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer> {
	
}