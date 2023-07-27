package Array_Problem;

public class Linear_Search {

	public static void main(String[] args) {
		int[] arr= {10,5,3,1,8,2};
		int search=1;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Array found at "+i+" index");
				temp=temp+1;
			}
			
		}
		if(temp==0)
		{
			System.out.println("Value not found");
		}
	}

}
