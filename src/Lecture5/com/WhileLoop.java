package Lecture5.com;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int sum=0;
		while(num<=n) {
			//System.out.println(num);
			sum=sum+num;
			num++;
		}
		System.out.println(sum);
		sc.close();
	}
}
