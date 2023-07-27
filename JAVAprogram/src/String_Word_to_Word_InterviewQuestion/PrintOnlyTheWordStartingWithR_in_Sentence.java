package String_Word_to_Word_InterviewQuestion;

public class PrintOnlyTheWordStartingWithR_in_Sentence {

	public static void main(String[] args) {
		String s="A Red Seed";
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
				/*if(w.startsWith("R"))        //startwith R
				{
					System.out.println(w);
				}*/
				/*if(w.endsWith("ed"))            //print only the word end with ed
				{
					System.out.println(w);
				}*/
				/*if(w.contains("e"))                   //print only the words containing e
				{
					System.out.println(w);
				}*/
				if(w.length()==3)         //print only words having 3 character in a sentence
				{
					System.out.println(w);
				}
				w="";
			}
		}

	}

}
