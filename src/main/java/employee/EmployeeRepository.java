package main.java.employee;

import java.util.List;
import employee.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, String> {

    public Employee findById(String id);

    public Employee findByFirstName(String firstName);

    public List<Employee> findByLastName(String lastName);

    @Override
    void delete(Employee deleted);
}
