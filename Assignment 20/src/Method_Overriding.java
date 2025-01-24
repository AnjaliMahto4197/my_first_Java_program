class Bike extends Vehical{

    private String hasSidecar;

    public Bike(int maxspeeed, String color,String hasSidecar) {
        super(maxspeeed, color);
        this.hasSidecar=hasSidecar;
    }


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of side Car = "+ hasSidecar);
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Bike example = new Bike(120,"Black", "No");
        example.displayInfo();
    }
}
