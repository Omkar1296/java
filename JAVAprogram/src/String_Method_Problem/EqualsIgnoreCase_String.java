package String_Method_Problem;

public class EqualsIgnoreCase_String {

	public static void main(String[] args) {
		String s1="omkar";
		String s2="Omkar";
		System.out.println(s1.equals(s2));  //false  check contain
		System.out.println(s1.equalsIgnoreCase(s2));    //it ignore case of letter and it give boolean value

	}

}
