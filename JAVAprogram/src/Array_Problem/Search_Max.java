package Array_Problem;

public class Search_Max {

	public static void main(String[] args) {
		int []a= {4,2,5,1,3,6};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum value in array is: "+max);

	}

}
