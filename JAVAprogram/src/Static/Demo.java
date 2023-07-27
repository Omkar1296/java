package Static;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main Start..");
		print1(12,44);
		System.out.println("Main end..");
		//System.out.println(a);

	}

	public static void print1(int i, int j) {
		System.out.println(i);
		print3();
		System.out.println(j);
		
	}
    
	public static void print3() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of two number: "+c);
		
	}
	static int a=print2();
	public static int print2() {
		System.out.println("Hello");
		return 100;
	}

	

}
