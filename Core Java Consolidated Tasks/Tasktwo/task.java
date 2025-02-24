import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double sal;
    int yearsWorked;

    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + sal);
        System.out.println("Years Worked: " + yearsWorked);
    }

    public void getLoanEligibility() {
        if (yearsWorked > 5) {
            if (sal >= 15_00_000) {
                System.out.println("Loan Amount Granted: 7 Lakhs");
            } else if (sal >= 10_00_000) {
                System.out.println("Loan Amount Granted: 5 Lakhs");
            } else if (sal >= 6_00_000) {
                System.out.println("Loan Amount Granted: 2 Lakhs");
            } else {
                System.out.println("No Loan Granted due to insufficient salary.");
            }
        } else {
            System.out.println("Employee is not eligible for a loan as they have not worked for more than 5 years.");
        }
    }
}

public class EmployeeLoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double sal = scanner.nextDouble();
        System.out.print("Enter Years Worked: ");
        int yearsWorked = scanner.nextInt();
       
        emp.setEmployeeDetails(empId, empName, sal, yearsWorked);
        
        emp.getEmployeeDetails();
        
        emp.getLoanEligibility();

        scanner.close();
    }
}
