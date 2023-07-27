package IMPORTANT_Practise_Program;
//suppose thir is number 212=2!+1!+2!=2*1+1*1+2*1=212

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Strong number from 100 to 1000");
		for(int i=100;i<=1000;i++)
		{
		System.out.println("Enter the value");
		int n=ss.nextInt();
		int m=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int j=1;j<=rem;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==m)
		{
			System.out.println("It is a Strong Number");
		}
		else
		{
			System.out.println("It is not a Strong Number");
		}
		}

	}

}
