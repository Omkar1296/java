package Array_Problem;

public class OddEven_In_Array {

	public static void main(String[] args) {
		int [] a= {1,2,5,6,3,2};
		System.out.println("Odd Numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Even Number");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
