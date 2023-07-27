package Static;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Entr the First Digit..");
		int a=ss.nextInt();
		
		System.out.println("Enter the Second Digit..");
		int b=ss.nextInt();
		
		System.out.println("Addition of two number is: "+Calcii.add(a,b));
		System.out.println("multiplication of two number is: "+Calcii.mul(a,b));
		System.out.println("division of two number is: "+Calcii.div(a,b));
		System.out.println("Substraction of two number is: "+Calcii.sub(10.5,25.5));

	}

}
