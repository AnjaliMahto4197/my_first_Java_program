import java.util.Scanner;

public class Substring_and_Indexing {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String FirstString = myObj.nextLine();


        System.out.print("Enter index of  string: ");
         int  index = myObj.nextInt();

         String result = FirstString.substring(index);

        System.out.println( "The result is "+result);







    }
}


