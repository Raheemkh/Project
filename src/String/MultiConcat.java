package String;

public class MultiConcat {
	public static void main(String[] args) {
		String str1="Hello" ;String str2="World";
		String str4="Java"; String str3="Welcom";
		//String result=s.concat(" ").concat(c);
		String result=str1.concat(" ").concat(str2).concat(str3).concat(" ").concat(str4);
		//System.out.println(s+" "+c);
		System.out.println(result);
	}
}
