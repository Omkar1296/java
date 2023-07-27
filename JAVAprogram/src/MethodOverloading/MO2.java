package MethodOverloading;

public class MO2 {

	public static void main(String[] args) {
		System.out.println("Welcome...");
		long b=88888888;
		add(20,45.55);
		add(b,35);
		add(255,22,55);

	}
	public static void add(int a,int b) {
		System.out.println("Substraction of Number is "+ (a-b));
	}
	
	public static void add(long b,int b1) {
		System.out.println("Additon of Number is "+ (b+b1));
	}

	public static void add(int a,double b) {
		System.out.println("Additon of Number is "+ (a+b));
	}
	
	public static void add(int a,double b,int c) {
		System.out.println("Additon of Number is "+ (a+b+c));
	}
	
	public static void add(int a,int c,int b) {
		System.out.println("Additon of Number is "+ (a+b));
	}
}
