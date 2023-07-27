package Method;

public class Return_type2 {

	public static void main(String[] args) {
		int a=101;
		double d=50;
		int result=add(++a,--d);
		System.out.println(result);

	}

	public static int add(int a, double d) {
		int total=(int) (a+d);
		return total;
		
	}

}
