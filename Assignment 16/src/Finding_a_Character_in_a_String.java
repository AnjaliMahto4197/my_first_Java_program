//import java.util.Scanner;
//
//public class Finding_a_Character_in_a_String {
//    public static void main(String[] args) {
//        Scanner myobj = new Scanner(System.in);
//        System.out.print("Enter First string: ");
//        String FirstString = myobj.nextLine();
//
//        System.out.print("Enter Search character: ");
//        char SearchChar = myobj.nextLine().charAt(0);
//
//        boolean found = false;
//        for (int i = 0; i < FirstString.length(); i++) {
//            if (FirstString.charAt(i) == SearchChar) {
//                System.out.println("Character found at index: " + i);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Character not found in the string.");
//        }
//    }
//}
//

import java.util.Scanner;
public class Finding_a_Character_in_a_String {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter input : ");
        String input= myObj.nextLine();
        System.out.println("Enter Character to search : ");
        String check =myObj.nextLine();
        int result = input.indexOf(check);
        System.out.print("Index of "+check+ " is : "+result);
    }
}
