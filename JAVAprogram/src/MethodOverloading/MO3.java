package MethodOverloading;

import java.util.Scanner;

public class MO3 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Entr the first value..");
		int a=ss.nextInt();
		
		System.out.println("Entr the second value..");
		int b=ss.nextInt();
		
		System.out.println("Entr the next value..");
		double c=ss.nextDouble();
		
		mul(a,b);
		mul(a,c);

	}
	public static void mul(int a,int b) {
		System.out.println("Multiplication of two Number is " + a*b);
		
	}
	
	public static void mul(int a,double reshab) {
		System.out.println("Multiplication of two Number is " + a*reshab);
		
	}
	

}
