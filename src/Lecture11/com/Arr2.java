package Lecture11.com;

import java.lang.reflect.Array;

public class Arr2 {
	static void change_array(int[] arr) {
		for(int i=0;i<arr.length;i++) {
	arr[i]=0;
	}
	}
public static void main(String[] args) {
	int[] arr=new int[3];
	arr[0]=34;
	arr[1]=12;
	arr[2]=45;
//	System.out.println(ages[0]);
//	System.out.println(ages[1]);
//	System.out.println(ages[2]);
//	
	for(int i=0;i<3;i++) {
		System.out.println(arr[i]);
	}
}

}
