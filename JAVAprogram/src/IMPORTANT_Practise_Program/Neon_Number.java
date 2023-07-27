package IMPORTANT_Practise_Program;
//neon number is 9^2=81----8+1=9  

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=ss.nextInt();
		for(int i=1;i<=n;i++)
		{
		int a=i*i;
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		if(i==sum)
		{
			System.out.println(i+" It is a Neon Number");
		}
		else
		{
			System.out.println(i+ " It is not a Neon Number");
		}
		}

	}

}
