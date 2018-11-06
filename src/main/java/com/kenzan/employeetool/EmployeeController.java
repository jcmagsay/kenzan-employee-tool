package com.kenzan.employeetool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping(method=RequestMethod.GET, value="/employee")
    public List<Employee> employee() {
        return repository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/employee")
    public String saveAll(@RequestBody Iterable<Employee> employeeList) {
        repository.saveAll(employeeList);

        return "Employees saved!";
    }

    @RequestMapping(method=RequestMethod.GET, value="/employee/{id}")
    public Employee show(@PathVariable String id) {
        return repository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        Employee e = repository.findById(id).get();
        if(employee.getFirstName() != null)
            e.setFirstName(employee.getFirstName());
        if(employee.getLastName() != null)
            e.setLastName(employee.getLastName());
        if(employee.getMiddleInitial() != null)
            e.setMiddleInitial(employee.getMiddleInitial());
        if(employee.getDateOfBirth() != null)
            e.setDateOfBirth(employee.getDateOfBirth());
        if(employee.getDateOfEmployment() != null)
            e.setDateOfEmployment(employee.getDateOfEmployment());
        if(employee.getEmploymentStatus() != null)
            e.setEmploymentStatus(employee.getEmploymentStatus());

        repository.save(e);

        return e;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
    public String delete(@PathVariable String id) {
        Employee e = repository.findById(id).get();

        if(e != null)
            e.setEmploymentStatus(false);

        repository.save(e);

        return String.format("employee deleted: %s", id);
    }
}
