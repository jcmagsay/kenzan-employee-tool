package com.kenzan.employeetool;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    public List<Employee> findAll();

    public Employee findByFirstName(String firstName);

    public List<Employee> findByLastName(@Param("lastName") String lastName);

    @Override
    void delete(Employee deleted);
}
