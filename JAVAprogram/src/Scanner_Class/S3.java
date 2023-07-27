package Scanner_Class;

import java.util.Scanner;

public class S3 {

	public static void main(String[] args) {
		//calculations 
		Scanner ss=new Scanner(System.in);
		System.out.println("Calculate Area of Circle..");
		System.out.println();
		System.out.println("Enter value of pi...");
		double pi=ss.nextDouble();
		
		System.out.println("Enter value of radius..");
		int r=ss.nextInt();
		
		area(pi,r);
		System.out.println("Area of circle is " + area(pi,r));

	}

	public static double area(double pi, int r) {
		return(pi*r*r);
		
	}

}
