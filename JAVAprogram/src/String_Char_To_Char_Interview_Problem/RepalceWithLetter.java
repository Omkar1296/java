package String_Char_To_Char_Interview_Problem;

public class RepalceWithLetter {

	public static void main(String[] args) {
		String s1="Hello guys had ur lunch";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='h'||c=='H')
			{
				c=(char) (c+17);
				s2=s2+c;
			}
			else
			{
				s2=s2+c;
			}
		}
		System.out.println("Before replace: "+s1);
		System.out.println("After replace: "+s2);

	}

}
