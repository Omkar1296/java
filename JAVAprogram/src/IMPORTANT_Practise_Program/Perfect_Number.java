package IMPORTANT_Practise_Program;
//perfect means 28 has factors or divisior such as 1,2,4,7,14
//making addition of 1+2+4+7+14=28 ...so it is perfect Number

public class Perfect_Number {

	public static void main(String[] args) {
		for(int j=1;j<=100;j++)
		{
		int n=j;
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			
			System.out.println(n+" given number is perfect number");
		}
		else
		{
			System.out.println(n+" given number is not perfect number");
		}
		}

	}

}
