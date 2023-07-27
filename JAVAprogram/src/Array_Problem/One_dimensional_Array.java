package Array_Problem;

public class One_dimensional_Array {

	public static void main(String[] args) {
		
		/*int [] a=new int[3];   //int [size]
		a[0]=10;
		System.out.println(a[0]);   //10
		System.out.println(a[1]);   //default value 0
		System.out.println(a[2]);   //default value 0
		*/
		
		/*int[]a=new int[] {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			System.out.print(a[i]+",");  //10,20,30,
		}*/
		
		/*int[]a= {10,20,30,40};
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");   //10,20,30,40,
		}*/
		
		int[]a={10,20};
		//for each loop       for(data type variable name:array/collection){}
		for(int i:a)
		{
			System.out.print(i+",");
		}
		
		
	}

}
