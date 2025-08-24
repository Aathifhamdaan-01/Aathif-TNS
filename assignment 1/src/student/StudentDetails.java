package student;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Full Name with Initial: ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number: ");
        String rollNo = sc.nextLine();

        System.out.println("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.println("Enter Percentage: ");
        String percentage = sc.nextLine();

        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("\t" + grade);
        System.out.println("\t\t" + percentage);

        sc.close();
    }
}

