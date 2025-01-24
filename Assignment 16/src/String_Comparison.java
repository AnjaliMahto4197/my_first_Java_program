import java.util.Scanner;

public class String_Comparison {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String FirstString = myobj.nextLine();


        System.out.print("Enter Second string: ");
        String SecondString = myobj.nextLine();

        if(FirstString.equals(SecondString)){
            System.out.println("Strings are identical ");
        }else{
            System.out.println("Strings are not  identical ");
        }


    }
}
