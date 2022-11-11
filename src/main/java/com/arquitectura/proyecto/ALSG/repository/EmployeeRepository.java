package com.arquitectura.proyecto.ALSG.repository;

import com.arquitectura.proyecto.ALSG.entitys.Customer;
import com.arquitectura.proyecto.ALSG.entitys.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
