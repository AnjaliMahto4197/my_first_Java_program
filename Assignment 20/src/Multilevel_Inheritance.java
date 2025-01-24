// Base class
class Employee {
    String name;
    int id;

    void work() {
        System.out.println(name + " is working.");
    }
}

// Derived class 1
class Manager extends Employee {
    String department;

    void manage() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

// Derived class 2
class Executive extends Manager {
    String region;

    void Executive() {
        System.out.println(name + " is Executing for the " + region + " region.");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Executive executive = new Executive();

        // Setting properties
        executive.name = "Pawan";
        executive.id = 101;
        executive.department = "CEO";
        executive.region = "India";

        // Test cases
        executive.work(); // Inherited from Employee
        executive.manage(); // Inherited from Manager
        executive.Executive(); // Specific to Executive
    }
}
