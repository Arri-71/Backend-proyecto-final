package com.arquitectura.proyecto.ALSG.Controllers;

import com.arquitectura.proyecto.ALSG.entitys.Customer;
import com.arquitectura.proyecto.ALSG.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private ICustomerService service;

    //traer todos los datos de la tabla customers
    @GetMapping("/api/employees")
    public List<Customer> getAll() {
        return service.getAll();
    }
    //traer los datos por id
    @GetMapping("/api/employees/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    //borrar los datos por id
    @DeleteMapping("/api/employees/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }
    //guardar los datos por id
    @PostMapping("/api/employees")
    public void save(@RequestBody Customer customer) {
        service.save(customer);
    }
}
