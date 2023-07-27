package IMPORTANT_Practise_Program;

import java.util.Scanner;

//logic  ------  ex.321=123 it is not a palindrome  where 121=121  it is palindrome
//reversing number 
//logic 1.find reminder by using % operator  123%10=3
//then use sum=(sum*10)+rem
//n=n/10  ex 123/10=12

public class Palindrome {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=ss.nextInt();
		int m=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(m==sum)
		{
			System.out.println("Given Number is Palindrome..");
		}
		else
		{
			System.out.println("Given number is not Palindrome..");
		}

	}

}
