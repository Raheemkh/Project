package Lecture11.com;
import java.util.*;


public class Arr1 {
	static void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
	}
		System.out.println();
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int n = sc.nextInt();
        int[] array = new int[5];
        array[0]=2;
		array[1]=4;
		array[2]=5;
		array[3]=6;
		array[4]=3;

//        System.out.println("Enter " + n + " elements:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();

        System.out.println("origin is: ");
        printarray(array);
        int[] arr2=Arrays.copyOfRange(array,   2,  4);
        
      //  int[] arr2=array.clone();
        System.out.println("repeated is: ");
	printarray(arr2);
//		arr2[0]=3;
//		arr2[1]=5;
//		arr2[2]=9;
//		arr2[3]=0;
//	System.out.println("array[]: ");
//	printarray(array);
//	System.out.println("arr2[]: ");
//	printarray(arr2);
//	
}
}
	