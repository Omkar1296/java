package Array_Problem;

public class Linear_Search_String {

	public static void main(String[] args) {
		String[]arr={"suyash","akshay","omkar","rohan","sourabh"};
		 String s="omkar";
		 int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals("omkar"))
			{
				System.out.println("String Array found at "+i+" index");
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Value not found");
		}

	}

}
