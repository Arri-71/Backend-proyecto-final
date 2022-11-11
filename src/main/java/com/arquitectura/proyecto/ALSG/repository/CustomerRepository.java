package com.arquitectura.proyecto.ALSG.repository;


import com.arquitectura.proyecto.ALSG.entitys.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//funciona como el crud de la base de datos pero sin echar tanto codigo

@Repository
public interface CustomerRepository extends CrudRepository <Customer, Long>{


}
