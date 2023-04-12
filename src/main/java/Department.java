import java.util.List;

public class Department implements Component {

    String name;
    List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDepartment(this);
    }

}
