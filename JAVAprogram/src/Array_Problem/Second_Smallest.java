package Array_Problem;

public class Second_Smallest {

	public static void main(String[] args) {
		int []a= {8,4,3,5,7,2,6,1};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second smallest array is: "+a[1]);

	}

}
