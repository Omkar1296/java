package Pattern_Problem;

public class Patt23 {

	public static void main(String[] args) {
		int n=4;
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)  //without writting if condition we use condition in for loop
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
