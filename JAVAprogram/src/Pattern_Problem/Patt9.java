package Pattern_Problem;

public class Patt9 {

	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a==10)
				{
					a=1;
				}
				System.out.print(a++ +" ");
			}
			System.out.println(" ");
		}

	}

}
