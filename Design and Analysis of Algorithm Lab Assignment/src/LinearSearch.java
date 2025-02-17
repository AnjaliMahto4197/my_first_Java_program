//Linear search



import java.util.Scanner;

public class LinearSearch {
    // Method to perform linear search
    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input target element
        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        // Call linear search and display the result
        boolean result = linearSearch(array, target); // Correct method call
        if (result) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}