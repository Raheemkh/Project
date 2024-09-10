package Lecture8.com;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Decimal_num=sc.nextInt();
		int ans=0;//converted Binary number
		int pw=1; //Power of 10
		
		while(Decimal_num>0) {
			int parity=Decimal_num%2;
			ans+=(parity*pw);
			
			pw*=10;
			Decimal_num/=2;
		}
		System.out.print(ans);
			
		}

}
