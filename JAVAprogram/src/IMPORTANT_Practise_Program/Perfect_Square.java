package IMPORTANT_Practise_Program;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=ss.nextInt();
		for(int j=1;j<=n;j++)
		{
		for(int i=1;i<j;i++)
		{
			if(i*i==j)
			{
				System.out.println("Perfect square of given "+ j +" is "+ i);
				//return;
			}
			
		}
		}
	}

}
