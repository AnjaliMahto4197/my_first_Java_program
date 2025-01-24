//creation of class
class Rectangle{

    //initialization of variable
    private double length;
    private double width;

    //initialization of default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    //initialization of parameter constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
// Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate parameter
    public double calculateParameter(){
        return 2*(length+width);
    }
    //displaying all data
    public void displayResult() {
        System.out.println("Rectangle Dimensions:");
        System.out.println("Length: " + length + " Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Parameter : "+ calculateParameter());
    }

}
public class RectangleDimension {
    public static void main(String[] args) {
            // default call of constructor
            Rectangle R1 = new Rectangle();
            System.out.println("Default Parameters:");
            R1.displayResult();

            // Parameterized call of constructor
            Rectangle R2 = new Rectangle(5.0, 3.0);
            System.out.println("Parameterized Parameters:");
            R2.displayResult();
        }

    }


