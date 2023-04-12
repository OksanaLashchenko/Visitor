import java.util.List;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitCompany(Company company) {
        System.out.println("Visit to company:");
        List<Department> departments = company.getDepartments();
        departments.forEach(this::visitDepartment);
    }

    @Override
    public void visitDepartment(Department department) {
        System.out.println("Visit to department: " + department.getName());
        List<Employee> employees = department.getEmployees();
        printDepartmentReport(employees);
    }

    private void printDepartmentReport(List<Employee> employeeList) {
        employeeList.forEach(this::printEmployeeReport);
    }

    private void printEmployeeReport(Employee employee) {
        System.out.printf("Employee: name: %s, position: %s, salary: %f%n", employee.getName(),
                employee.getPosition(), employee.getSalary());
    }

}
