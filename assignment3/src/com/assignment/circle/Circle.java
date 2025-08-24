package com.assignment.circle;

public class Circle {
    private double radius;
    private String colour;

    // Setters (instead of scanner input here)
    public void setDetails(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Colour of Circle: " + colour);
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
