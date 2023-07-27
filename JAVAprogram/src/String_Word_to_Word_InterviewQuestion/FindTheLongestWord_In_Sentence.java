package String_Word_to_Word_InterviewQuestion;

public class FindTheLongestWord_In_Sentence {

	public static void main(String[] args) {
		String s="A RED SEED";
		String w="";
		s+=" ";
		String lw="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w+=c;
			}
			else 
			{
				if(w.length()>lw.length())
				{
					lw=w;
			    }
				w="";
			}
			
		}
		System.out.println("Longest Word "+lw);

	}

}
