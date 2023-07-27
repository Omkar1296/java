package String_Char_To_Char_Interview_Problem;

public class WriteProgramTO_ReverseStringCase {

	public static void main(String[] args) {
		String s="Hello Dad";
		String d="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				d=d+Character.toLowerCase(c);
			}
			else
			{
				d=d+Character.toUpperCase(c);
			}
		}
		System.out.println(d);

	}

}
