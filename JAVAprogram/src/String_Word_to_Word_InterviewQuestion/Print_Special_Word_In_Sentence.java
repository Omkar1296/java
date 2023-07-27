package String_Word_to_Word_InterviewQuestion;

import java.util.Scanner;

public class Print_Special_Word_In_Sentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String w="";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			{
				w+=c;
			}
			else
			{
				char f=w.charAt(0);
				char l=w.charAt(w.length()-1);
				//if(Character.toUpperCase(l)== Character.toLowerCase(f))
				if(l==f)
				{
					System.out.println(w);
				}
				w="";
			}
		}

	}

}
