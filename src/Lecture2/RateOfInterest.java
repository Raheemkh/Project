package Lecture2;

import java.util.Scanner;

public class RateOfInterest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Principle");
		float p=sc.nextFloat();
		
		System.out.println("enter rate of interest");
		float r=sc.nextFloat();
		
		System.out.println("enter time");
		float t=sc.nextFloat();
		float SI=(p*r*t)/100;
				System.out.println("enter rate of interest :"+SI);
	}

}
