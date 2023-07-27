package Static;

public class Display2 {
	
	static int k=230;
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Value of k is: "+k);
		demo();
		Display2.demo();
		

	}
	static
	{
		System.out.println("value of k is: "+k);
		k=600;
	}
	public static void demo() {
		System.out.println("Inside Demo");
		
	}
	

}
