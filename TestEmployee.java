/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemployee;


abstract class Employee { 
    private String name;
    private int employeeId;

    public Employee() {
    }

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculatePay();

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class TestEmployee { 
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Abebe", 101, 5000.00);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Alemu", 102, 200.00, 8);

        System.out.println("Full-Time Employee:");
        System.out.println("Name of full-time employee: " + fullTimeEmployee.getName());
        System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeId());
        System.out.println("Monthly Salary: $" + fullTimeEmployee.calculatePay());

        System.out.println("\nPart-Time Employee:");
        System.out.println("Name: " + partTimeEmployee.getName());
        System.out.println("Employee ID: " + partTimeEmployee.getEmployeeId());
        System.out.println("Total Pay: $" + partTimeEmployee.calculatePay());
    }
}
