package String_Char_To_Char_Interview_Problem;

public class StringPalindrome {

	public static void main(String[] args) {
		//String s="Hello World";    //no
		String s="dad";           //yes
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Yes it is palindrome");
		}
		else
		{
			System.out.println("No it is not palindrome");
		}
		

	}

}
