import java.util.Scanner;

public class Trimming_Whitespaces {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter First string: ");
        String FirstString = myobj.nextLine();
        System.out.println("Without Trim String:"+FirstString);

        System.out.println("After Trimming:"+FirstString.trim());
    }
}
