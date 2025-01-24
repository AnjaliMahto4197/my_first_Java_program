class circle {
    private double radius ;

    public circle(){
        this.radius=1;
    }

    public circle(double radius) {
        this.radius = radius;
    }
    // Method to calculate area
    public double  calculatearea(){
        return (3.14*radius*radius);
    }
    // Method to calculate circumference
    public double  calculatcircumference(){
        return (2*3.14*radius);
    }
    //displaying all data
    public void displayResult() {
        System.out.println("Circle  Dimensions:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculatearea());
        System.out.println("Circumference  : "+ calculatcircumference());
    }

}


public class CircleWithRadius {
    public static void main(String[] args) {

        circle c1 = new circle();
        System.out.println("Default Parameters:");
        c1.displayResult();

        circle c2 = new circle();
        System.out.println("Parameterized constructor :");
        c2.displayResult();
    }
}
