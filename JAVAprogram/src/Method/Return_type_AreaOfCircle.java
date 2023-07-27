package Method;

public class Return_type_AreaOfCircle {
	public static double area(int r,double pi)
	{
		//double area=pi*r*r;
		//return area;
		return  (pi*r*r);
	}

	public static void main(String[] args) {
		System.out.println("Area of Circle...");
		double pi=3.14;
		int r1=5;
		int r2=8;
		int r3=4;
		System.out.println(area(r1,pi));
		System.out.println(area(r2,pi));
		System.out.println(area(r3,pi));		

	}

}
