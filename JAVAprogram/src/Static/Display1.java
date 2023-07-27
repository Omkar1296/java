package Static;

public class Display1 {

	static double a;
	public static void main(String[] args) {
		int a=100;
		System.out.println("Value of a is: "+ a);
		

	} 
	static
	{
		System.out.println("Value of a is: "+ a);
		a=200;
	}

}
