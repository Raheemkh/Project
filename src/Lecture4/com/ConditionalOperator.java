package Lecture4.com;
import java.util.*;
public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();

		//if(value % 2==0 && value %3==0) {
		 //System.out.println("found ans");
		 if(value % 5==0 || value % 3==0) {
			 System.out.println("found ans: "+value);
sc.close();
	 }

}
}

