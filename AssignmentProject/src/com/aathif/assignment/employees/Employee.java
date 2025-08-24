package com.aathif.assignment.employees;

/**
 * Base class Employee
 * Demonstrates encapsulation with private attributes and public getters/setters.
 */
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Public constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and setters (public to allow controlled access)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { // protected for subclass use
        this.salary = salary;
    }
}
