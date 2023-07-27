package Pattern_Problem;

public class Patt12 {

	public static void main(String[] args) {
		int n=4;
		int a=2;
		char c='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print(c+" ");
					c++;
				}
				else
				{
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println(" ");
		}

	}

}
