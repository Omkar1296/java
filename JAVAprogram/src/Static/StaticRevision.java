package Static;

public class StaticRevision {
	
	static int i=test1();
	static int j=test2();
	public static void main(String[] args) {
		System.out.println("Main Starts..");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("Main Ends...");

	}
	public static int test1()
	{
		System.out.println("Test1 Starts..");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("Test1 Ends...");
		return 10;
	}
	
	public static int test2()
	{
		System.out.println("Test2 Starts..");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("Test2 Ends...");
		return 100;
	}

}
