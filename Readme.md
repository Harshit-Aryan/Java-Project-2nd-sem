# Java Payroll System

A flexible payroll system built in Java that demonstrates **class inheritance**, **polymorphism**, and **parameterized constructors** using a parent `Employee` class with `FullTime` and `PartTime` subclasses.

---

## Project Structure

```
payroll/src/
├── Employee.java        # Abstract parent class with common employee fields
├── FullTime.java        # Subclass for full-time salaried employees
├── PartTime.java        # Subclass for part-time hourly employees
└── PayrollSystem.java   # Driver class — entry point of the program
```

---

## Class Overview

### `Employee` (Abstract Parent Class)
Holds common personal details shared by all employee types.

| Field | Type | Description |
|---|---|---|
| `name` | `String` | Employee's full name |
| `employeeId` | `int` | Unique employee ID |
| `department` | `String` | Department name |

- Declares the abstract method `calculateSalary()` — every subclass must implement its own salary logic.
- `displayInfo()` prints employee details and calls `calculateSalary()` polymorphically.

---

### `FullTime` (Subclass)
Represents a full-time salaried employee.

| Field | Type | Description |
|---|---|---|
| `baseSalary` | `double` | Fixed monthly base salary |
| `bonus` | `double` | Performance or fixed bonus |
| `taxDeduction` | `double` | Tax amount to be deducted |

**Salary Formula:**
```
Salary = baseSalary + bonus - taxDeduction
```

---

### `PartTime` (Subclass)
Represents a part-time hourly employee.

| Field | Type | Description |
|---|---|---|
| `hourlyRate` | `double` | Pay rate per hour |
| `hoursWorked` | `int` | Total hours worked in the period |

**Salary Formula:**
```
Salary = hourlyRate × hoursWorked
```

---

## Key Concepts Demonstrated

- **Inheritance** — `FullTime` and `PartTime` extend the `Employee` parent class.
- **`super()` Constructor** — Both subclasses call `super(name, employeeId, department)` to initialize common fields.
- **Abstract Method** — `calculateSalary()` is declared abstract in `Employee` and implemented differently in each subclass.
- **Polymorphism** — All employees are stored in an `Employee[]` array; the correct `calculateSalary()` is dispatched at runtime.

---

## How to Run

### Prerequisites
- Java JDK 17 or higher installed
- A terminal or command prompt

### Steps

**1. Clone or download the project files.**

**2. Navigate to the `src` directory:**
```bash
cd payroll/src
```

**3. Compile all Java files:**
```bash
javac Employee.java FullTime.java PartTime.java PayrollSystem.java
```

**4. Run the program:**
```bash
java PayrollSystem
```

---

## Sample Output

```
========== PAYROLL REPORT ==========

[Full-Time Employee]
Base Salary  : Rs. 60000.0
Bonus        : Rs. 10000.0
Tax Deducted : Rs. 8000.0
-----------------------------
Name        : Ravi Sharma
Employee ID : 101
Department  : Engineering
Salary      : Rs. 62000.00
-----------------------------

[Part-Time Employee]
Hourly Rate  : Rs. 350.0
Hours Worked : 80 hrs
-----------------------------
Name        : Ankit Verma
Employee ID : 201
Department  : Support
Salary      : Rs. 28000.00
-----------------------------

========== SALARY SUMMARY ==========
Ravi Sharma     -> Rs. 62000.00
Priya Mehta     -> Rs. 55500.00
Ankit Verma     -> Rs. 28000.00
Sneha Gupta     -> Rs. 30000.00

Total Payroll Expense : Rs. 175500.00
=====================================
```

---

## Extending the Project

You can add new employee types by:
1. Creating a new class that `extends Employee`
2. Calling `super(...)` in the constructor
3. Overriding `calculateSalary()` with the new salary logic

**Example:**
```java
public class Contract extends Employee {
    private double projectFee;
    private double platformCut;

    public Contract(String name, int id, String dept, double projectFee, double platformCut) {
        super(name, id, dept);
        this.projectFee  = projectFee;
        this.platformCut = platformCut;
    }

    @Override
    public double calculateSalary() {
        return projectFee - platformCut;
    }
}
```

---

## License

This project is for educational purposes.
