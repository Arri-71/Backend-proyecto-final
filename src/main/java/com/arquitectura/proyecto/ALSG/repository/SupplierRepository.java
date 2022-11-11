package com.arquitectura.proyecto.ALSG.repository;

import com.arquitectura.proyecto.ALSG.entitys.Customer;
import com.arquitectura.proyecto.ALSG.entitys.Employee;
import com.arquitectura.proyecto.ALSG.entitys.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long> {
}
