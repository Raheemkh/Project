package Lecture6.com;
	import java.util.Scanner;

	public class Task1 {

		public static void main(String[] args) {
			
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int sumOfDigits=0;
				//int numOfDigits=0;
				int original_n=n;
				
				while(n>0) {

					sumOfDigits+=n%10;
					n=n/10;
					
					//numOfDigits++;
				}
				System.out.println("Number Of Digits in "+original_n +"="+sumOfDigits);
				//System.out.println("Number Of Digits in "+ original_n +"="+numOfDigits);
				sc.close();
		}

	}

