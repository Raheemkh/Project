package Lecture11.com;

import java.util.Scanner;

public class question {

    static int countOccurrences(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for array size
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        // Reading array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Asking for the number to count occurrences of
        System.out.println("Enter x: ");
        int x = sc.nextInt();

        // Output the count of occurrences
        System.out.println("Count of x: " + countOccurrences(array, x));

        // Close the scanner
        sc.close();
    }
}
