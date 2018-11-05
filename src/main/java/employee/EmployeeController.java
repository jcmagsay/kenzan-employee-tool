package employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final String template = "Employee Name, %s!";

    @RequestMapping("/employee")
    public Employee employee(
        @RequestParam(value="firstname", defaultValue="Jill") String firstname,
        @RequestParam(value="lastname", defaultValue="Magsaysay") String lastname
    ) {
        return new Employee(firstname, lastname);
    }
}
