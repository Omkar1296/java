package String_Method_Problem;

public class PlusOperator_Concat_join_String {

	public static void main(String[] args) {
		String s1="omkar";
		String s2="murdande";
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1 + 10);
		System.out.println(s1+10/20);
		//System.out.println(s1+10-5);  //error
		System.out.println(String.join(";", s1,s2));
	}

}
