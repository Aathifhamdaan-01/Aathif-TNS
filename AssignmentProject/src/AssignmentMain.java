import com.aathif.assignment.employees.*;
import com.aathif.assignment.utilities.EmployeeUtilities;

/**
 * Main class to test Employees and Utilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager
        Manager mgr = new Manager("Alice", 101, 80000, "HR");

        // Create Developer
        Developer dev = new Developer("Bob", 102, 60000, "Java");

        // Print details
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(mgr);
        System.out.println("Department: " + mgr.getDepartment());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(dev);
        System.out.println("Programming Language: " + dev.getProgrammingLanguage());

        // Give salary raise
        System.out.println("\nApplying Salary Raise...");
        EmployeeUtilities.giveRaise(mgr, 10);  // 10% raise for manager
        EmployeeUtilities.giveRaise(dev, 5);   // 5% raise for developer
    }
}
