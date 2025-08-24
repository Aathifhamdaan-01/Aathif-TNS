package com.assignment.circle;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter colour of circle: ");
        String colour = sc.next();

        c.setDetails(radius, colour);
        c.calcArea();
    }
}
