
public class FullTime extends Employee {

    private double baseSalary;
    private double bonus;
    private double taxDeduction;

    public FullTime(String name, int employeeId, String department,
                    double baseSalary, double bonus, double taxDeduction) {
        super(name, employeeId, department);  
        this.baseSalary    = baseSalary;
        this.bonus         = bonus;
        this.taxDeduction  = taxDeduction;
    }


    @Override
    public double calculateSalary() {
        return baseSalary + bonus - taxDeduction;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n[Full-Time Employee]");
        System.out.println("Base Salary  : Rs. " + baseSalary);
        System.out.println("Bonus        : Rs. " + bonus);
        System.out.println("Tax Deducted : Rs. " + taxDeduction);
        super.displayInfo();
    }
}
