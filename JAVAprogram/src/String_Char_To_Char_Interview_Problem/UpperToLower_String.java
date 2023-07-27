package String_Char_To_Char_Interview_Problem;

public class UpperToLower_String {

	public static void main(String[] args) {
		String s1="HELLO";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(c>='A'&&c<='Z')
			{
				c=(char) (s1.charAt(i)+32);    //upper to lower A+32
				s2=s2+c;
			}
			else
			{
				s2=s2+c;
			}
		}
		System.out.println("After converting upper to lower is: "+s2);

	}

}
