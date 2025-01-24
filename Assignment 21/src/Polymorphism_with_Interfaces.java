interface Shape{
      void draw();
//      {
//          System.out.println("This is shape");
//      };
}
class Circle implements Shape{

    @Override
    public void draw() {
         System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Polymorphism_with_Interfaces {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
