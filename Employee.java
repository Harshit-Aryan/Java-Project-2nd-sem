// Parent class encapsulating common employee details
public abstract class Employee {

    private String name;
    private int employeeId;
    private String department;

    // Parameterized constructor
    public Employee(String name, int employeeId, String department) {
        this.name       = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    // Abstract method — each subclass must provide its own salary logic
    public abstract double calculateSalary();

    // Display employee details + calculated salary
    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Department  : " + department);
        System.out.printf( "Salary      : Rs. %.2f%n", calculateSalary());
        System.out.println("-----------------------------");
    }

    // Getters
    public String getName()       { return name; }
    public int    getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }
}
