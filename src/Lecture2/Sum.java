package Lecture2;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num_1=sc.nextInt();
		System.out.println("enter second number");
		int num_2=sc.nextInt();
			int sum=num_1+num_2;
		System.out.println("sum of number :" +sum);
}
}