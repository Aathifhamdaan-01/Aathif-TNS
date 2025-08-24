package com.aathif.assignment.utilities;

import com.aathif.assignment.employees.Employee;

/**
 * Utility class for Employee operations.
 */
public class EmployeeUtilities {

    /**
     * Prints details of any employee.
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }

    /**
     * Gives salary raise to an employee (demonstrates protected setter access).
     */
    public static void giveRaise(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        // using protected method from Employee
        emp.setSalary(newSalary);
        System.out.println("Salary updated to: " + emp.getSalary());
    }
}
