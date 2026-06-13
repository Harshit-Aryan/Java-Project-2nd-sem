
public class PayrollSystem {

    public static void main(String[] args) {

    
        FullTime emp1 = new FullTime("Ravi Sharma",   101, "Engineering", 60000, 10000, 8000);
        FullTime emp2 = new FullTime("Priya Mehta",   102, "Marketing",   55000,  7000, 6500);

      
        PartTime emp3 = new PartTime("Ankit Verma",   201, "Support",     350, 80);
        PartTime emp4 = new PartTime("Sneha Gupta",   202, "Design",      500, 60);

       
        Employee[] employees = { emp1, emp2, emp3, emp4 };

        System.out.println("========== PAYROLL REPORT ==========");

      
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        System.out.println("\n========== SALARY SUMMARY ==========");
        double totalPayroll = 0;
        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            System.out.printf("%-15s -> Rs. %.2f%n", emp.getName(), salary);
            totalPayroll += salary;
        }
        System.out.printf("%nTotal Payroll Expense : Rs. %.2f%n", totalPayroll);
        System.out.println("=====================================");
    }
}
