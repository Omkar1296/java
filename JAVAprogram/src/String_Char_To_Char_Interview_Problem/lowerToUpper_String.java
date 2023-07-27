package String_Char_To_Char_Interview_Problem;

public class lowerToUpper_String {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(c>='a'&&c<='z')
			{
				c=(char) (s1.charAt(i)-32);       //for lower to upper a-32 is used
				s2=s2+c;
			}
			else
			{
				s2=s2+c;
			}
		}
		System.out.println("After converting lower to upper is: "+s2);
	}

}
