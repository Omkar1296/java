package Exception_Handling;

public class Exception3 {

	public static void main(String[] args) {
		System.out.println("1");
		try
		{
			System.out.println("2");
			int a=10,b=0, c=a/b;       //Suppose if their is no exception occur in try block, catch block will not executed
			//Suppose if their is  exception occur in try block where they got exception it jump from their to catch block and remaining wriiten statement will not executed, catch block will  executed
			System.out.println("3");   
			System.out.println(c);
			System.out.println("4");
		}
		catch(Exception e)  //Whenever thir is Exception e is written it is parent class
		{
			System.out.println("5");
			System.out.println("6");
			System.out.println("7");
		}
		System.out.println("Hello");

	}

}
