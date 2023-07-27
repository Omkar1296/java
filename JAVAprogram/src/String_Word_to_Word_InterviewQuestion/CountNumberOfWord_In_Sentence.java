package String_Word_to_Word_InterviewQuestion;

public class CountNumberOfWord_In_Sentence {

	public static void main(String[] args) {
		String s="MOM AND DAD";
		String w="";
		s+=" ";
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
				count++;
				w="";
			}
		}
		System.out.println("No. Of Words "+count);

	}

}
