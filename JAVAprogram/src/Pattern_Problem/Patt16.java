package Pattern_Problem;

public class Patt16 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
