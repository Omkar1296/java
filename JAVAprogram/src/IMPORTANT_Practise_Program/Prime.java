package IMPORTANT_Practise_Program;
//prime means divided by itself and 1  ex.3 divided by 3 and 1

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=ss.nextInt();
		int count=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(n+ " it is Prime Number");
		}
		else
		{
			System.out.println(n+ " it is Not Prime Number");
		}

	}

}
