
class Animal1 {
    void feed() {
        System.out.println("Feeding the animal.");
    }
}

// Subclass 1
class Dog1 extends Animal1 {

    @Override
    void feed() {
        System.out.println("Feeding the dog.");
    }
}

// Subclass 2
class Cat1 extends Animal1 {

    @Override
    void feed() {
        System.out.println("Feeding the cat.");
    }
}

public class Polymorphism_in_Arrays {

    public static void main(String[] args) {

        Animal1[] animals = new Animal1[2];

        animals[0] = new Dog1();
        animals[1] = new Cat1();


        for (Animal1 animal : animals) {
            animal.feed();
        }
    }
}



