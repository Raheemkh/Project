package Lecture6.com;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ans=0;
	while(n>0) {
		ans=ans*10+n%10;
		n=n/10;
		
	
	}
	System.out.println("Reversed number is "+ans);
	sc.close();
}


}
