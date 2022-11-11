package com.arquitectura.proyecto.ALSG.services;

import com.arquitectura.proyecto.ALSG.entitys.Customer;
import com.arquitectura.proyecto.ALSG.entitys.Employee;
import com.arquitectura.proyecto.ALSG.entitys.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAll();
    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);
}
