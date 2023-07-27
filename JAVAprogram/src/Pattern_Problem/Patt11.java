package Pattern_Problem;

public class Patt11 {

	public static void main(String[] args) {
		int n=4;
		int a=2;
		int k=3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print(a+" ");
					a=a+2;
				}
				else
				{
					System.out.print(k+" ");
					k=k+3;
				}
			}
			System.out.println(" ");
		}

	}

}
