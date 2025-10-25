package Day5OOPS;

// Parent class
class Employer {
    String companyName = "Tech Solutions Pvt Ltd";
    String location = "Chennai";

    void displayEmployerDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Location: " + location);
    }
}

// Child class inheriting from Employer
class Employee extends Employer {
    String empName;
    int empId;
    String designation;

    void setEmployeeDetails(String name, int id, String desig) {
        empName = name;
        empId = id;
        designation = desig;
    }

    void displayEmployeeDetails() {
        System.out.println("\nEmployee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Designation: " + designation);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Create object of Employee (child class)
        Employee e1 = new Employee();

        // Set employee details
        e1.setEmployeeDetails("Vigneshwaran", 101, "QA Automation Engineer");

        // Display both Employer (Parent) and Employee (Child) details
        e1.displayEmployerDetails();
        e1.displayEmployeeDetails();
    }
}
