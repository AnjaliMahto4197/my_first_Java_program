import java.util.Scanner;

public class String_Concatenation_and_Length {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String FirstString = myObj.nextLine();
        int length1=FirstString.length();

        System.out.print("Enter Second string: ");
        String SecondString = myObj.nextLine();
        int length2 = SecondString.length();


        int totallength = length1+length2;



        System.out.println(  "Concating first and second word :"+FirstString.concat(SecondString));
        System.out.println("Total Length :"+totallength);
    }
}
