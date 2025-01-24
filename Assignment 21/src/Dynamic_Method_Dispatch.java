class Vehical {

    public void displayInfo(){
        System.out.println("MAIN VEHICAL  CALLED");


    }
}

class car extends Vehical{


    @Override
    public void displayInfo(){
        //super.displayInfo();
        System.out.println("CAR  CALLED");
    }
}

class Bike extends Vehical{


    @Override
    public void displayInfo(){
       super.displayInfo();
        System.out.println("BIKE CALLED");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Vehical myCar = new car();
        Vehical myBike = new Bike();

        // Test cases
        myCar.displayInfo();
        myBike.displayInfo();
    }
}
