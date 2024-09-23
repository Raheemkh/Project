package Lecture11.com;

public class eray {
	void eray() {
		int[]ages=new int[3];
		ages[0]=34;
		ages[1]=12;
		ages[2]=45;
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(ages[i]);
		}
		}
	public static void main(String[] args) {
		eray obj=new eray();
		obj.eray();
	}

}
