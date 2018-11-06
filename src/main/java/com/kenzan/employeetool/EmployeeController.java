package com.kenzan.employeetool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping(method=RequestMethod.GET, value="/employee")
    public Iterable<Employee> employee() {
        return repository.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/employee")
    public String save(@RequestBody Employee employee) {
        repository.save(employee);

        return employee.getId();
    }

    @RequestMapping(method=RequestMethod.GET, value="/employee/{id}")
    public Employee show(@PathVariable String id) {
        return repository.findById(id).get();
    }

    @RequestMapping(method=RequestMethod.PUT, value="/employee/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
        Employee employ = repository.findById(id).get();
        if(employ.getFirstName() != null)
            employ.setFirstName(employ.getFirstName());
        if(employ.getLastName() != null)
            employ.setLastName(employ.getLastName());
        if(employ.getMiddleInitial() != null)
            employ.setMiddleInitial(employ.getMiddleInitial());
        if(employ.getDateOfBirth() != null)
            employ.setDateOfBirth(employ.getDateOfBirth());
        if(employ.getDateOfEmployment() != null)
            employ.setDateOfEmployment(employ.getDateOfEmployment());
        if(employ.getEmploymentStatus() != null)
            employ.setEmploymentStatus(employ.getEmploymentStatus());
        repository.save(employ);
        return employee;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
    public String delete(@PathVariable String id) {
        Employee employee = repository.findById(id).get();
        repository.delete(employee);

        return "employee deleted";
    }
}
