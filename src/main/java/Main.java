import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice Smith", "Senior Back-end Software Engineer", 5000.0);
        Employee employee2 = new Employee("Bob Busset", "Senior Front-end Software Engineer", 4500.0);
        Employee employee3 = new Employee("Cindy Sheppard", "Senior QA Engineer", 4000.0);
        Employee employee4 = new Employee("Donald Duck", "Middle QA Engineer", 3000.0);

        Department softwareDevelopment = new Department(List.of(employee1, employee2));
        softwareDevelopment.setName("Software Development Department");
        Department qaDepartment = new Department(List.of(employee3, employee4));
        qaDepartment.setName("Quality Assurance department");

        Company company = new Company(List.of(softwareDevelopment, qaDepartment));

        Visitor visitor = new ConcreteVisitor();
        company.accept(visitor);
        System.out.println("Visiting department");
        softwareDevelopment.accept(visitor);
        qaDepartment.accept(visitor);
    }

}
