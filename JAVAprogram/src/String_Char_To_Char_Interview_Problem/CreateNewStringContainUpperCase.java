package String_Char_To_Char_Interview_Problem;

public class CreateNewStringContainUpperCase {

	public static void main(String[] args) {
		String s1="Hello Dude";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(Character.isUpperCase(c))
			{
				s2=s2+c;
			}
		}
		System.out.println(s2);

	}

}
