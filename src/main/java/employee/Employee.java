package main.java.employee;

import java.text.SimpleDateFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Employee {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String middleInitial;
    public DateTime dateOfBirth;
    public DateTime dateOfEmployment;
    public Boolean employmentStatus;

    public Employee() {}

    public Employee(
        String firstName,
        String lastName,
        String middleInitial,
        DateTime dateOfBirth,
        DateTime dateOfEmployment,
        Boolean employmentStatus
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEmployment = dateOfEmployment;
        this.employmentStatus = employmentStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public DateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(DateTime dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Boolean getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Boolean employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    // @Override
    public String toString() {
        return String.format(
                "Employee[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
