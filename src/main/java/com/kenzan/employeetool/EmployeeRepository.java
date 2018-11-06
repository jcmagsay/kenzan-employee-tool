package com.kenzan.employeetool;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<Employee, String> {

    public Employee findByFirstName(String firstName);

    public List<Employee> findByLastName(String lastName);

    @Override
    void delete(Employee deleted);
}
