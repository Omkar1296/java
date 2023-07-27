package Exception_Handling;

import java.util.Scanner;

//throw keyword used to create an exception object manually
//used in unchecked exception.....used in method class
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}

public class Throw_Keyword {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age=s.nextInt();
		if(age<18)
		{
			throw new YoungerAgeException("U r not eligible for voting");
		}
		else
		{
			System.out.println("U can vote successfully");
		}
		

	}

}
