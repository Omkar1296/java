package IMPORTANT_Practise_Program;
//example 153^3=1^3+5^3+3^3=1+125+27=153

public class Arm_Strong_Number {

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
		{
		int n=i;
		
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int cub=rem*rem*rem;
			sum=sum+cub;
			n=n/10;
		}
		if(sum==i)
		{
			System.out.println(i+" It is a Arm Strong Number");
		}
		//else
		//{
			//System.out.println(i+" It is not a Arm Strong Number");
		//}
		}

	}

}
