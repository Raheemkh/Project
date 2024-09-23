package MethodandScopes.com;
import java.util.*;

public class Algebra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
   

        System.out.print("The array is: ");
        
            System.out.print(array[i] + " ");
        }

        sc.close(); // Closing the scanner after use
    }
}
