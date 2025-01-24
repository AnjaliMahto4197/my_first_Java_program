// Superclass
class Animal {
   public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public  void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
   public void makeSound() {
        System.out.println("Meow");
    }
}

public class Basic_Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Test cases
        myDog.makeSound();
        myCat.makeSound();
    }
}



