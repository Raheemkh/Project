package Lecture10.com;
import java.util.Scanner;
public class OutsideOfClass {
class algebra{
	int a, b;
	algebra(){
		System.out.println("constructor called");
	}
	int add() {
		int ans=a+b;
		return ans;
	}
	int sub() {
		return a-b;
		
	}
}
	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=a+b;
		System.out.println("sum of input number is:" +ans);
		System.out.println(ans);
}
}

