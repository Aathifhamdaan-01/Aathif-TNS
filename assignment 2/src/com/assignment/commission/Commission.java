package com.assignment.commission;

import java.util.Scanner;


public class Commission {
    // Data Members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission;

    // Method (i): Accept details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method (ii): Calculate commission
    public void calculateCommission() {
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        } else {
            commission = 0;
        }
    }

    // Display details
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Address    : " + address);
        System.out.println("Phone      : " + phone);
        System.out.println("Sales Amt  : " + salesAmount);
        System.out.println("Commission : " + commission);
    }
}
