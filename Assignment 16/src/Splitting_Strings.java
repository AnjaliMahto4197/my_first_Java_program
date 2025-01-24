import java.util.*;
import java.util.Arrays;
public class Splitting_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string with commas: ");
        String inputString = scanner.nextLine();

        String[] stringArray = inputString.split(",");

        System.out.println("Split string array: " + Arrays.toString(stringArray));
    }
    }







