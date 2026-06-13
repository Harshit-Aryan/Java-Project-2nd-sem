
public class PartTime extends Employee {

    private double hourlyRate;
    private int    hoursWorked;


    public PartTime(String name, int employeeId, String department,
                    double hourlyRate, int hoursWorked) {
        super(name, employeeId, department);   
        this.hourlyRate  = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

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
