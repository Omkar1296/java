package IMPORTANT_Practise_Program;

import java.util.Scanner;

public class Square_Root {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		
		if(n!=0)
		{
			int i=n*n;
			System.out.println("Square of given number is "+ i);
		}

	}

}
