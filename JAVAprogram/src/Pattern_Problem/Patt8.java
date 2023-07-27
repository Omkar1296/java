package Pattern_Problem;

public class Patt8 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
			int a=1;
			char c='a';
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print(a+" ");
				}
				else
				{
					System.out.print(c+" ");
				}
			}
			System.out.println(" ");
		}

	}

}
