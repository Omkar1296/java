package String_Word_to_Word_InterviewQuestion;

public class FindTheWordOR_ExistsInA_String {

	public static void main(String[] args) {
		String s="MOM OR DAD";
		String w="";
		s+=" ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c!=' ')
			{
				w=w+c;
			}
			else
			{
				if(w.equalsIgnoreCase("OR"))
				{
					count++;
				}
				w="";
			}
		}
		if(count==0)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("Found");
		}

	}

}
