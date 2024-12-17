//creating class employee
class Employee{

    //instance variable

    private String name;
    private int employeeId;
    private double salary;

    //Static variables
    private static int employeeCount = 0;
    private  static  double totalPayroll = 0;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;

        // Update static variables
        employeeCount++;
        totalPayroll += salary;
    }

    // Static method to get total number of employees
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Static method to get total payroll
    public static double getTotalPayroll() {
        return totalPayroll;
    }

    // Instance method to adjust salary
    public void adjustSalary(double amount) {
        this.salary += amount;
        totalPayroll += amount;
    }

    // Instance method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }


}

// Company class
class Company {
    private Employee[] employees;

    private int employeeCount;

    // Constructor
    public Company(int size) {
        employees = new Employee[size];
        employeeCount = 0;
    }

    // Method to add an employee to the company
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Cannot add more employees. Company is full.");
        }
    }

    // Method to display all employees' details
    public void displayAllEmployees() {
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayDetails();
            System.out.println("----------------------------");
        }
    }
}

public class Company_Employee_Management {
    public static void main(String[] args) {
        // Create company
        Company company = new Company(5); // Company can hold 5 employees

        // Create employees
        Employee emp1 = new Employee("Pawan", 101, 50000);
        Employee emp2 = new Employee("Raj", 102, 55000);
        Employee emp3 = new Employee("Amit", 103, 60000);
        Employee emp4 = new Employee("Ramesh", 104, 65000);
        Employee emp5 = new Employee("Satish", 105, 70000);

        // Add employees to the company
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);
        company.addEmployee(emp4);
        company.addEmployee(emp5);

        // Display all employee
        company.displayAllEmployees();

        // Adjust salary
        emp1.adjustSalary(5000);
        emp3.adjustSalary(3000);

        // Display updated details of all employees
        company.displayAllEmployees();

        //  get total employees and total payroll
        System.out.println("\nTotal Number of Employees: " + Employee.getEmployeeCount());
        System.out.println("Total Payroll: $" + Employee.getTotalPayroll());
    }

}
