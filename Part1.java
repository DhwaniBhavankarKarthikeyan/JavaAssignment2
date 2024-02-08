package Part1;
import java.util.Scanner;

public class oddEven {
	   
    public static void displayArray(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of numbers : ");
        int n = scanner.nextInt();
        int[] even = new int[n];
        int[] odd = new int[n];
        int evenCount = 0, oddCount = 0;
       
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0)
            {
                even[evenCount] = num;
                evenCount++;
            }
            else
            {
                odd[oddCount] = num;
                oddCount++;
            }
        }
        System.out.println("\nEven numbers:");
        displayArray(even, evenCount);
        System.out.println("\nOdd numbers:");
        displayArray(odd, oddCount);
    }
}
