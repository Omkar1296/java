package String_Char_To_Char_Interview_Problem;

public class Print_Count_Digit {

	public static void main(String[] args) {
		String s="26Non Stop";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			//if(Character.isDigit(c))      //count the digit
			//if(c=='S'||c=='s')               //count the word
			char u=Character.toUpperCase(c);    //uppercase
			if(c=='S')
			{
				count++;
			}
		}
		System.out.println("Digit "+count);
	}
	

}
