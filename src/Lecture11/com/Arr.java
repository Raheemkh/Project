package Lecture11.com;

public class Arr {
	void array(){
	int[]ages=new int[3];
	float[] weight=new float[3];
//String[]names=new String[5];
	String[] names = {"apple", "banana", "cherry"};
	System.out.println(ages.length);
	System.out.println(weight.length);
	System.out.println(names.length);
	ages[0]=43;
	ages[1]=34;
	ages[2]=65;
	//ages[5]=23;
	weight[0]=45.43f;
			weight[1]=635;
					weight[2]=43.4f;
		
				System.out.println(names[0]);
				System.out.println(names[1]);
				System.out.println(names[2]);
					System.out.println(ages[0]);
					System.out.println(ages[1]);
					System.out.println(ages[2]);
					System.out.println(weight[0]);
					System.out.println(weight[1]);
					System.out.println(weight[2]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr obj=new Arr();
		obj.array();
	}
}
