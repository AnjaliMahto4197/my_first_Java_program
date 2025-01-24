class  Employee{
    private String name;
    private int employeeId;
    private double salary;

    public Employee(){
        this.name = "Unknown";
        this.employeeId = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displaydata(){
        System.out.println("______Employee Record______");
        System.out.println("Name :" + name );
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Salary : " + salary);

    }



}
public class EmployeeRecord {
    public static void main(String[] args) {

        // default call of constructor
        Employee E1 = new Employee();
        System.out.println("Default Parameters:");
        E1.displaydata();

        // Parameterized call of constructor
        Employee E2 = new Employee( "Pawan",1234,123456);
        System.out.println("Parameterized Parameters:");
        E2.displaydata();
    }
}
