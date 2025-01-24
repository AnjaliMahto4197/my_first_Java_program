final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class Immutable_Classes {
    public static void main(String[] args) {

        ImmutablePerson person = new ImmutablePerson("Jane", 45);


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());


        // person.name = "John";
        // person.age = 50;
    }
}

