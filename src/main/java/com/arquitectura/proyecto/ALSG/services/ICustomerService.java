package com.arquitectura.proyecto.ALSG.services;

import com.arquitectura.proyecto.ALSG.entitys.Customer;

import java.util.List;
// interface para la inyeccion de dependencias de buena manera
public interface ICustomerService {

        List<Customer> getAll();
        Customer getById(Long id);
        void remove(Long id);
        void save(Customer customer);
    }


