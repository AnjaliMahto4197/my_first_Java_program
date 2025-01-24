class Vehical {
   private  int maxspeeed;
    private String color;

    public Vehical(int maxspeeed, String color) {
        this.maxspeeed = maxspeeed;
        this.color = color;
    }

    public void displayInfo(){
        System.out.println("______Information of the Vehicle______");
        System.out.println("MaxSpeed of vehicle :"+maxspeeed);
        System.out.println("color of vehicle :"+color);
    }
}

class car extends Vehical{
    private int numberOfDoors;

    public car(int maxspeeed, String color, int numberOfDoors) {
        super(maxspeeed, color);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors in Car = "+ numberOfDoors);
    }
}


public class Basic_Inheritance {
    public static void main(String[] args) {
        car example = new car(200, "red", 5);
        example.displayInfo();
    }
}
