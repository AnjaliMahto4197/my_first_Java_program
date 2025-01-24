import java.util.Scanner;

public class Replace_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the character to be replaced: ");
        char oldChar = scanner.nextLine().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = scanner.nextLine().charAt(0);

        if (originalString.indexOf(oldChar) != -1) {
            String modifiedString = originalString.replace(oldChar, newChar);
            System.out.println("Modified string: " + modifiedString);
        } else {
            System.out.println("Character '" + oldChar + "' not found in the original string.");
        }
    }
}
