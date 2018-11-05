package employee;

import org.springframework.data.annotation.Id;

public class Employee {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Employee() {}

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // @Override
    public String toString() {
        return String.format(
                "Employee[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    //
    // public String getMiddleInitial() {
    //     return content;
    // }
    //
    // public String getLastName() {
    //     return content;
    // }
    //
    // public String getDateOfBirth() {
    //     return content;
    // }
    //
    // public String getDateOfEmployment() {
    //     return content;
    // }
    //
    // public String getStatus() {
    //     return content;
    // }

}
// ID - Unique identifier for an employee
// FirstName - Employees first name
// MiddleInitial - Employees middle initial
// LastName - Employeed last name
// DateOfBirth - Employee birthday and year
// DateOfEmployment - Employee start date
// Status - ACTIVE or INACTIVE
