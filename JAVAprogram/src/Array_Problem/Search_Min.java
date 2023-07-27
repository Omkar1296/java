package Array_Problem;

public class Search_Min {

	public static void main(String[] args) {
		int []arr= {4,2,5,1,3,6};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value of array is: "+min);
	}

}
