package Basic;

import java.util.Scanner;

public class Email {
	public static String[]getUserDetails(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your name ");
	String name=sc.nextLine();
	System.out.print("Enter your job position you applied for: ");
	String jobPosition=sc.nextLine();
	return new String[] {name,jobPosition};
	}
	public static String generateSuccessEmail(String name,String jobPosition) {
		return "Dear " + name+ ",\n\n"+"Congrtulations! we are pleased to inform you that you have been selected for the " +jobPosition+" position.\n"+
	"we are look forward to having you on our team\n\n"+
				"Best reagard,\n"+
				"The HR Team";

	}
		public static void main(String[] args) {
			String[] userDetails=getUserDetails();
			String name=userDetails[0];
			String jobPosition =userDetails[1];
			String successEmail=generateSuccessEmail(name,jobPosition);
			System.out.println("\n"+successEmail);
		}
}
