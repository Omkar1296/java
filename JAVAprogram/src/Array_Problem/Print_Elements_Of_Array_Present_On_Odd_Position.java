package Array_Problem;

public class Print_Elements_Of_Array_Present_On_Odd_Position {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		
		System.out.println("Elements Of Array Present On Odd Position: ");
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
