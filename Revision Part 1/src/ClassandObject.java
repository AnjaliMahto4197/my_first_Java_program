class c1{
  public String name = "Pawan";
   public int id = 1;
}
// defining a class
class Dog {
    String name;
    int age;

    void setName(String name) {
        this.name = name; // 'this' keyword is used to refer to the current object's name
    }

    void setAge(int age) {
        this.age = age; // 'this' keyword is used to refer to the current object's age
    }

    public  void bark() {
        System.out.println("Woof! Woof!");
    }
}
//crating a object
public class ClassandObject {
    public static void main(String[] args) {

        // Creating an object of Dog class
        Dog myDog = new Dog();

        myDog.name = "Buddy";
        myDog.age = 3;
        System.out.println("My dog's name is " + myDog.name);
        System.out.println("My dog is " + myDog.age + " years old.");
        myDog.bark(); // Calling the bark method


        myDog.setName("Tiger");
        myDog.setAge(5);
        System.out.println("My dog's name is " + myDog.name);
        System.out.println("My dog is " + myDog.age + " years old.");
        myDog.bark(); // Calling the bark method

        // Creating an object of C1 class
        c1 obj1 =new c1();

        System.out.println(obj1.name);
        System.out.println(obj1.id);
    }

}





