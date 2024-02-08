package Part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Taking input for each element of the array
        String[] array = new String[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.next();
        }

        // Converting array to ArrayList
        List<String> arrayListFromArray = Arrays.asList(array);
        ArrayList<String> fruitList = new ArrayList<>(arrayListFromArray);

        System.out.println("Converting Array to ArrayList:");
        System.out.println(fruitList);

        // Converting ArrayList to array
        String[] item = fruitList.toArray(new String[fruitList.size()]);

        System.out.println("Converting ArrayList to Array:");
        for (String s : item) {
            System.out.println(s);
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}


