package Lecture11.com;

public class Array {

	void Array() {
		int[][] arr_1= new int[4][5];
		int[][] arr= {{34,43,4},{23,54,3},{12,54,2}};
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr.length);
	}
	public static void main(String[] args) {
		Array obj=new Array();
		obj.Array();
	}

}
