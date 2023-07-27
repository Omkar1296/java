package Pattern_Problem2;

public class Patt28 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				
			}
			
			System.out.println("");
		}
		for(int i1=1;i1<=n;i1++)
		{
			for(int j=n-1;j>=i1;j--)
			{
				System.out.print("*");
			}
		
			System.out.println("");
		}

	}

}
