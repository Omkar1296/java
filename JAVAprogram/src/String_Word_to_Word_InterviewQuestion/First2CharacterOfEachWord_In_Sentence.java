package String_Word_to_Word_InterviewQuestion;

public class First2CharacterOfEachWord_In_Sentence {

	public static void main(String[] args) {
		String s="In The Box";
		String w="";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				System.out.print(w.substring(0,2));
				w="";
			}
			
		}

	}

}
