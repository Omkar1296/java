package Pattern_Problem2;

public class Patt29 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j<=n;j--)
			{
				if(j>=i)
				{
					System.out.print(" ");
				}
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*");
				}
				for(int l=2;l<=i;l++)
				{
					System.out.print("*");
				}
			
			System.out.println("");
			
		}
		

	}

}
