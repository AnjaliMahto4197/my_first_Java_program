class truck extends Vehical{
    private String LoadCapacity;

    public truck(int maxspeeed, String color, String loadCapacity) {
        super(maxspeeed, color);
        LoadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("loadCapacity of Truck = "+ LoadCapacity);
    }
}

public class Use_of_super_Keyword {
    public static void main(String[] args) {
    truck example = new truck(400, "blue","3000Kg");
        example.displayInfo();
    }
}
