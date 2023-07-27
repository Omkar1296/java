package String_Char_To_Char_Interview_Problem;

public class Count_Word {

	public static void main(String[] args) {
		String s="The Animal is Pure soul";           
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("The number of word present in given String is: "+count); //19 
	}

}
