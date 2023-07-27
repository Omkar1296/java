package String_Char_To_Char_Interview_Problem;

public class RemoveTheWhiteSpaces {

	public static void main(String[] args) {
		String s="Hello Dad";
		String d="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
			{
				d=d+c;
			}
		}
		System.out.println(d);

	}

}
