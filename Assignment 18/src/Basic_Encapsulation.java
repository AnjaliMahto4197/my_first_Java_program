class Person{
    private String name;
    private int age;

    public Person() {
        this.name = "John";
        this.age=30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null&&!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be null or empty.");

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }


}

public class Basic_Encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person() ;
        person1.setName("Pawan");
        person1.setAge(3000);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}
