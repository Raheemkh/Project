package Basic;

public class Overriding {
	public int add(int a,int b) {
		return a+b;
		}
		public int add(int a,int b,int c) {
		return a+b+c;
		}
		public double add(double a,double b) {
			return a+b;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Overloading calc=new Overloading();
			System.out.println(calc.add(1,2));
		}

}
