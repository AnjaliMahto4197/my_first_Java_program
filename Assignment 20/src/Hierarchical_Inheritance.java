//Base class
class Animal{
    public void eat(){
        System.out.println("This animal eats food.");
    }

}
// Derived class 1
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
// Derived class 2
class Cat extends Animal {
    void purr() {
        System.out.println("The cat purrs.");
    }
}


public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        cat.eat();
        cat.purr();
    }
}
