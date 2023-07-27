package Use_of_SuperKeyword;
//"super" keyword can be uesd to invoke immediate parent class method
class C
{
	public void m1()
	{
		System.out.println("I am in class A");
	}
}
class D extends C
{
	public void m1()
	{
		System.out.println("I am in class B");
	}
	public void show()
	{
		m1();
		super.m1();
	}
}

public class Super2 {

	public static void main(String[] args) {
		D b=new D();
		b.show();

	}

}
