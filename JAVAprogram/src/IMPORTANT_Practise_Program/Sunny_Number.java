package IMPORTANT_Practise_Program;
//n=80
//n+1=80+1=81

public class Sunny_Number {

	public static void main(String[] args) {
		int n=8;
		int a=n+1;
		int sq=a*a;
		int count=0;
		for(int i=1;i<n/2;i++)
		{
			if(n==i*i)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("It is sunny number");
		}
		else
		{
			System.out.println("It is not sunny number");
		}
		

	}

}
