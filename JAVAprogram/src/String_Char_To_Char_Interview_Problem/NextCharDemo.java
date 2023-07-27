package String_Char_To_Char_Interview_Problem;

public class NextCharDemo {

	public static void main(String[] args) {
		String s="Simply";
		String enc="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='Y'||c=='Z'||c=='y'||c=='z')
			{
				c-=26;
				c+=1;
				enc=enc+c;
			}
		}
		System.out.println(enc);

	}

}
