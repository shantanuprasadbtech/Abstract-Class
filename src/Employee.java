public class Employee {
    private String name;
    private String role;
    private double salary;
    private Department department;

    // Constructor
    public Employee(String name, String role, double salary, Department department) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.department = department;
    }
}