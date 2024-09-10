package Lecture3.com;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					int p=4,q=3,r=6;
			//&&
			System.out.println((p<q)&&(r>q));//false
			System.out.println((p>q)&&(r>q));//true
			//||
			System.out.println((p<q)||(r>q));//true
			System.out.println((p>r)||(r<q));//false
			//!
			System.out.println(!(r>q));//false
			System.out.println(!(r<q));//true
			
			

	}

}
