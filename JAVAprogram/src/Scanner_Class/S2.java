package Scanner_Class;

import java.util.Scanner;

public class S2 {
	
	public static int add(int a,int b)
	{
		return(a+b);
	}
	
	public static int sub(int a,int b)
	{
		return(a-b);
	}
	
	public static int mul(int a,int b)
	{
		return(a*b);
	}
	
	public static int div(int a,int b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Addition of Two Number..");
		System.out.println("Enter 1st value...");
		int a=ss.nextInt();
		
		System.out.println("Enter 2nd value....");
		int b=ss.nextInt();
		
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		
		System.out.println("Addition of two number is "+ (a+b));
		System.out.println("Substraction of two number is "+ (a-b));
		System.out.println("multiplication of two number is "+ (a*b));
		System.out.println("Division of two number is "+ (a/b));

	}

}
