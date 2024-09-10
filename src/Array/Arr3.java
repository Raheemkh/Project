package Array;

public class Arr3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {10,20,30,40,50};
		//int myArray[]=new int[5];
		 int sum=0;
		// myArray[0]=10;
		// myArray [1]=20;
		 //myArray [2]=30;
		// myArray[3]=40;
		// myArray[4]=50;
		for(int i=0;i<myArray.length;i++) {
			sum=sum+myArray[i];
		}
		double average=sum/myArray.length;
		System.out.println(sum);
			
		    System.out.println(average);
	}
}
