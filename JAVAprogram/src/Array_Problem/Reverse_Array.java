package Array_Problem;

public class Reverse_Array {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50,60,70};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array is..");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
