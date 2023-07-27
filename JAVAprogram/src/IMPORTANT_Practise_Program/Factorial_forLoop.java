package IMPORTANT_Practise_Program;

import java.util.Scanner;

public class Factorial_forLoop {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=ss.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial for "+ n+" is "+fact);
	}

}
