package Method;

public class M4 {
	public static void add(int a,int b)  //Userdefined method
	{
		System.out.println("Addition of two no. is "+ (a+b));
	}
	
	public static void sub(int a,int b)  //formal argument
	{
		System.out.println("Substraction of two no. is "+ (a-b));
	}
	
	public static void mul(int a,int b)
	{
		System.out.println("Multiplication of two no. is "+ (a*b));
	}
	
	public static void div(int a,int b)
	{
		System.out.println("division of two no. is "+ (a/b));
	}

	public static void main(String[] args) {
		System.out.println("Wlcome to maths world..");
		int a=50;
		int b=5;
		add(a,b);  //actual argument
		sub(a,b);
		mul(a,b);
		div(a,b);
	}

}
