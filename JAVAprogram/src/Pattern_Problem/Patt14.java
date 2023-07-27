package Pattern_Problem;

public class Patt14 {

	public static void main(String[] args) {
		int n=4;
		int a=1;
		char c='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1)
				{
					System.out.print(a++ +" ");
				}
				else
				{
					System.out.print(c++ +" ");
				}
			}
			System.out.println(" ");
		}

	}

}
