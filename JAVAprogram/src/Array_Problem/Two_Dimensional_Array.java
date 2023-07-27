package Array_Problem;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		/*int [][]a=new int[2][3];    //matrix array
		a[0][0]=10;
		a[1][0]=50;
		a[2][0]=10;
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);
		System.out.println(a[2][0]);
		*/
		
		/*int [][]a=new int[2][];
		a[0]=new int[3];             //jogged array
		a[1]=new int[2];
		a[0][1]=10;
		System.out.println(a[0][1]);
		*/
		
		/*int [][] a= {{10,20},{50,60,70},{22,44,55,44}};
		System.out.println(a[0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][2]);
		System.out.println(a.length);
		System.out.println(a[2].length);
		*/
		
		int [][]a={{10,20},{50,60,70},{22,44,55,44}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
