package String_Char_To_Char_Interview_Problem;

public class CreateNewStringWith_DigitFirst_andThenCharacter {

	public static void main(String[] args) {
		String s="NO26 Sound";
		String d="",r="";
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(Character.isDigit(c))
			{
				d=d+c;
			}
			else
			{
				r=r+c;
			}
		}
		String sen=d+r;
		System.out.println(sen);

	}

}
