import java.util.Scanner;

public class Counting_Specific_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the character to search: ");
        char searchChar = scanner.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.println("The character '" + searchChar + "' appears " + count + " times in the string.");
    }
}
