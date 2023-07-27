package String_Word_to_Word_InterviewQuestion;

public class DeleteTheWordRED_In_Sentence_andPrint {

	public static void main(String[] args) {
		String s="A RED SEED";
		String w="";
		s+=" ";
		String ns="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(!w.equals("RED"))
				{
					ns=ns+w+" ";
				}
				w="";
			}
		}
		System.out.println(ns);

	}

}
