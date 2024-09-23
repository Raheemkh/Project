package MethodandScopes.com;

import Lecture11.com.Array;

public class Test1 {
	public static void decreased(int n1,int n2) {
		n1--;
		n2=n2-2;
		System.out.println(n1+";"+n2);
		
	}


	public static void main(String[] args) {
		int p= 26;
		int q=13;
		decreased(p,q);
		System.out.print(p+";"+q);
	}
}
