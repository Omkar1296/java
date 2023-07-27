package String_Char_To_Char_Interview_Problem;

public class LowerAndUpper_Word_Count {

	public static void main(String[] args) {
		String s="Wlcome To Automation";
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>=65&&c<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println("lower"+lower);
		System.out.println("upper"+upper);
	}

}
