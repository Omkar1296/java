package String_Char_To_Char_Interview_Problem;

public class Print_ASCII_Code {

	public static void main(String[] args) {
		String s="ITS Simple";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			System.out.println(c+" "+(int)c);
		}

	}

}
