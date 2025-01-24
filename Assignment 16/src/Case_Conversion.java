
import java.util.Scanner;
//
//public class Case_Conversion {
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.print("Enter First string: ");
//        String FirstString = myobj.nextLine().toLowerCase();
//        String ResultString1 = FirstString.toUpperCase();
//
//
//
//
//        System.out.println("String in lower case: "+ FirstString);
//        System.out.println("String in Upper case: "+ ResultString1);
//    }
//
//}
public class Case_Conversion {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String FirstString = myobj.nextLine();

        String resultString = "";
        for (char ch : FirstString.toCharArray()) {

            if (Character.isUpperCase(ch)) {

                resultString += (Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {

                resultString += (Character.toUpperCase(ch));
            } else {

                resultString += (ch);
            }
        }

        System.out.println(resultString);
    }
}