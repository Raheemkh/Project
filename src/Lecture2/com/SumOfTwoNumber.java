package Lecture2.com;
import java.util.Scanner;
public class SumOfTwoNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter first num: ");
		int num1=sc.nextInt();
		System.out.println("enter Second num: ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("the sum of two number: "+sum);
		sc.close();
	}
}
