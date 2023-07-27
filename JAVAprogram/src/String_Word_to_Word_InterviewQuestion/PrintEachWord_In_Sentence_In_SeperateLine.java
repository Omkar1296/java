package String_Word_to_Word_InterviewQuestion;

import java.util.Scanner;

public class PrintEachWord_In_Sentence_In_SeperateLine {

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
				w=w+c;
			}
			else
			{
				System.out.println(w);
				w="";
			}
			
		}

	}

}
