package String_Char_To_Char_Interview_Problem;

public class Count_Vowels_In_string {

	public static void main(String[] args) {
		String s="Hello World Education";
		String d="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				d=d+c;
			}
		}
		System.out.println("Vowels from String is "+d);

	}

}
