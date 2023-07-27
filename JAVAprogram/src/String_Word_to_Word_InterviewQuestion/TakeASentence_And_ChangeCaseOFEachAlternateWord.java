package String_Word_to_Word_InterviewQuestion;

public class TakeASentence_And_ChangeCaseOFEachAlternateWord {

	public static void main(String[] args) {
		String s="MOM AND DAD";
		String w="";
		s+=" ";
		String ns="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(count++%2==0)
				{
					ns=ns+w.toUpperCase()+" ";
				}
				else
				{
					ns=ns+w.toLowerCase()+" ";
				}
				w="";
			}
		}
		System.out.println(ns);

	}

}
