package Method;

public class M5 {
	
	public static void dinga()
	{
		System.out.println("Dinga pass...");
		dingi();
		System.out.println("Dinga fail...");
	}
	
	public static void dingi()
	{
		System.out.println("Inside dingi...");
		System.out.println("Outside dingi...");
		
	}

	public static void main(String[] args) {
		System.out.println("Inside main...");
		dinga();
		System.out.println("Outside main...");

	}

}
