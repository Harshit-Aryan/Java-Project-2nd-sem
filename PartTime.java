// Subclass for part-time employees
// Salary = hourlyRate * hoursWorked
public class PartTime extends Employee {

    private double hourlyRate;
    private int    hoursWorked;

    // Parameterized constructor using super()
    public PartTime(String name, int employeeId, String department,
                    double hourlyRate, int hoursWorked) {
        super(name, employeeId, department);   // call parent constructor
        this.hourlyRate  = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Polymorphic salary calculation for part-time employees
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n[Part-Time Employee]");
        System.out.println("Hourly Rate  : Rs. " + hourlyRate);
        System.out.println("Hours Worked : " + hoursWorked + " hrs");
        super.displayInfo();
    }
}
