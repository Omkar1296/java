package IMPORTANT_Practise_Program;
//Prime Number form 1 to 100

import java.util.Scanner;

public class Prime_2 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=ss.nextInt();
		for(int j=1;j<=n;j++)
		{
		int count=0;
		for(int i=2;i<=j-1;i++)
		{
			if(j%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(j+" It is Prime Number");
		}
		else
		{
			System.out.println(j+" It is not a Prime Number");
		}
		}

	}

}
