package String_Char_To_Char_Interview_Problem;

public class CreateNewString_UppercaseFirst_ThenLowerCase {

	public static void main(String[] args) {
		String s="Hello Dude";
		String d="",r="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				d=d+c;
			}
			else if(Character.isLowerCase(c))
			{
				r=r+c;
			}
		}
		String sen=d+r;
		System.out.println(sen);

	}

}
