package com.arquitectura.proyecto.ALSG.services;

import com.arquitectura.proyecto.ALSG.entitys.Customer;
import com.arquitectura.proyecto.ALSG.entitys.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    void remove(Long id);
    void save(Employee employee);
}
