package Lecture2.com;
import java.util.Scanner;
public class TakingInput {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter name :");
String name=sc.nextLine();
System.out.println("yur name is :" +name);
System.out.print("enter lucky no :");
int num1=sc.nextInt();
System.out.println("your lucky no :" +num1);
sc.close();
	}
}
