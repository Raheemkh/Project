package Lecture12.com;

import java.util.Scanner;

public class Test1 {
    static int Test1(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        // Loop through the array to find pairs
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for array size
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Reading array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Asking for the target sum after all array elements are input
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Output the count of occurrences
        System.out.println("Number of pairs with the target sum: " + Test1(arr, target));

        // Close the scanner
        sc.close();
    }
}
