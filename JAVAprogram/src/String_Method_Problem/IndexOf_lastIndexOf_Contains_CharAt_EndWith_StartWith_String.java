package String_Method_Problem;

public class IndexOf_lastIndexOf_Contains_CharAt_EndWith_StartWith_String {

	public static void main(String[] args) {
		String s="Omkar";
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf("mk"));
		System.out.println(s.indexOf('m',4));
		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.lastIndexOf("ka"));
		System.out.println(s.charAt(2));
		System.out.println(s.contains("mk"));   //true
		System.out.println(s.startsWith("O"));  //true
		System.out.println(s.endsWith("k"));  //false

	}

}
