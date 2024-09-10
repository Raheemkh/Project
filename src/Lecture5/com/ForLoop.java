package Lecture5.com;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int num=n; num>=1; num--) {
			System.out.println(num);
		}
		
		
		
		
		//for(int num=1; num<=n; num++)// {
			//System.out.println(num);
		//}
		//System.out.println(sum);
		sc.close();
	}
}
