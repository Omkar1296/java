package String_Char_To_Char_Interview_Problem;

public class LowerAndUpper_Character {

	public static void main(String[] args) {
		String s="Wlcome To Automation";
		/*String lower="";
		String upper="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>=65&&c<=90)
			{
				upper=upper+c;
			}
			else
			{
				lower=lower+c;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
		*/
		int count=0,countl=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				count++;
			}
			if(Character.isLowerCase(c))
			{
				countl++;
			}
		}
		System.out.println(count+" upper");
		System.out.println(countl+" lower");

	}

}
