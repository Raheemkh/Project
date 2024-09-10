package Array;

public class Arr2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {6,57,4,35,5};
		int max=myArray[0];
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]>=max) {
		    max=myArray[i];
			}
		}
			System.out.println(max);
	}
}

