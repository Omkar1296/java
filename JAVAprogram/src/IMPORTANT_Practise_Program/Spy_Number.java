package IMPORTANT_Practise_Program;
//spy number is summation===product
//Ex.1124----sum=1+1+2+4=8 and prod=1*1*2*4=8
//spy number from 1 to 1000

import java.util.Scanner;

public class Spy_Number {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=ss.nextInt();
		for(int i=100;i<=n;i++)
		{
		int m=i;
		int sum=0;
		int prod=1;
		while(m>0)
		{
			int rem=m%10;
			sum=sum+rem;
			prod=prod*rem;
			m=m/10;
		}
		if(sum==prod)
		{
			System.out.println(i+" it is a spy Number");
		}
		else
		{
			System.out.println(i+" it is not a spy Number");
		}
		}

	}

}
