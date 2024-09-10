package Lecture8.com;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Binary_num=sc.nextInt();
		int ans=0;//converted Decimal number
		int pw=1; //2^0=1
		
		while(Binary_num>0) {
			int unit_digit=Binary_num%10;
			ans+=(unit_digit*pw);
			Binary_num/=10;
			pw*=2;
		}
		System.out.print(ans);
			
		}

}
