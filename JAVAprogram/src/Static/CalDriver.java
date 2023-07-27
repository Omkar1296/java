package Static;

import java.util.Scanner;

public class CalDriver {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter frist value");
		double a=ss.nextDouble();
		
		System.out.println("Enter second value");
		double b=ss.nextDouble();
		
		Calci.add(a,b);
		Calci.mul(a, b);
		Calci.div(0, b);

	}

}
