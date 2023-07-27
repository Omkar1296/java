package Array_Problem;

public class Three_Dimensional_Array {

	public static void main(String[] args) {
		/*int [][][] a=new int[2][3][4];
		a[0][0][0]=10;
		System.out.println(a[0][0][0]);
		System.out.println(a.length);
		System.out.println(a[0][0].length);
		*/
		
		int [][][] a= {{{10,20},{455,588,22},{55,85,77,55}}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
