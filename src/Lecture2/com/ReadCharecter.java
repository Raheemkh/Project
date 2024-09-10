package Lecture2.com;

import java.util.Scanner;

public class ReadCharecter {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charecter is: ");
		char ch=sc.next().charAt(4);
		System.out.println(" charecter is: "+ch);
	sc.close();	
}
}
