package String_Method_Problem;

public class LengthMethod_IsEmpty_Trim_String {

	public static void main(String[] args) {
		String s="Omkar";
		String s2="";
		String s3="    ";
		String s4=" omkar raju murdande   ";
		System.out.println(s.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s4.trim());    //trimn used to remove spaces
		System.out.println(s4);
	}

}
