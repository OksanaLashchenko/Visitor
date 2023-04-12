import java.util.List;

public class Company implements Component {

    List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompany(this);
    }

}
