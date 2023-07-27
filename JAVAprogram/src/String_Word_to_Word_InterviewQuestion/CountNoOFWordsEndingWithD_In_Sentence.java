package String_Word_to_Word_InterviewQuestion;

public class CountNoOFWordsEndingWithD_In_Sentence {

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
				if(w.endsWith("D"))  //words starting with  2.words containing  3.words of specific length
				{
					count++;
				}
				w="";
			}
		}
		System.out.println("No. of Word "+count);

	}

}
