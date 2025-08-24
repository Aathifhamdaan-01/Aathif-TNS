package com.assignment.commission;

public class MainProgram {
    public static void main(String[] args) {
        Student s = new Student();
        Commission c = new Commission();
        
        c.acceptDetails();
        c.calculateCommission();
        c.displayDetails();
    }
}
