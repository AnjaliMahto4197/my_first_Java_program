class Modify{
    final int CONSTANT;
    public Modify() {
        this.CONSTANT=10;
    }
}
public class Final_Modifier_with_Variables {
    public static void main(String[] args) {

        Modify M1 = new Modify();
        System.out.println(M1.CONSTANT);

      //  M1.CONSTANT=20;
        System.out.println(M1.CONSTANT);
    }
}
