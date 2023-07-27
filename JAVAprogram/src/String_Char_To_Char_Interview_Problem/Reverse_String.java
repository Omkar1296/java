package String_Char_To_Char_Interview_Problem;

public class Reverse_String {

	public static void main(String[] args) {
		String s1="omkar";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reverse String is: "+s2);
		

	}

}
