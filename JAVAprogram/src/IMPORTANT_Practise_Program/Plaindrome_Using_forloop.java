package IMPORTANT_Practise_Program;

import java.util.Scanner;

public class Plaindrome_Using_forloop {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value..");
		int i=ss.nextInt();
		int sum=0;
		for(int n=i;n>0;n=n/10)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
		}
		if(i==sum)
		{
			System.out.println(i+" it is a palindrome");
		}
		else
		{
			System.out.println(i+" it is not palindrome");
		}

	}

}
