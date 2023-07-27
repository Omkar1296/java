package Pattern_Problem2;

public class Patt30 {

	public static void main(String[] args) {
		int n=4;
		int space=0;
		int count=7;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for (int k=0;k<count;k++ )
			{
				System.out.print("* ");
			}
			space++;
			count=count-2;
			System.out.println();
		}
	}

}
