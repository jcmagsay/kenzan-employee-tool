import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Override
    // public void run(String... args) throws Exception {
    //
    //     repository.deleteAll();
    //
    //     // save a couple of employees
    //     repository.save(new Employee("Alice", "Smith"));
    //     repository.save(new Employee("Bob", "Smith"));
    //
    //     // fetch all employees
    //     System.out.println("Employees found with findAll():");
    //     System.out.println("-------------------------------");
    //     for (Employee employee : repository.findAll()) {
    //       System.out.println(employee);
    //     }
    //     System.out.println();
    //
    //     // fetch an individual employee
    //     System.out.println("Employee found with findByFirstName('Alice'):");
    //     System.out.println("--------------------------------");
    //     System.out.println(repository.findByFirstName("Alice"));
    //
    //     System.out.println("Employees found with findByLastName('Smith'):");
    //     System.out.println("--------------------------------");
    //     for (Employee employee : repository.findByLastName("Smith")) {
    //       System.out.println(employee);
    //     }
    // }
}
