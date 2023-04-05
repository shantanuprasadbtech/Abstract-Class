public class Department {
    private String name;
    private String location;
    private List<Employee> employees;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

// Abstract class for displaying Department information
public abstract class DepartmentInfo {
    public abstract void displayDepartmentInfo(Department department);
}

// Interface for displaying Department location information
public interface DepartmentLocation {
    public void displayLocation(Department department);
}
