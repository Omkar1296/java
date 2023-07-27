package Abstract_Method_And_Interface_Method;

//Multiple Inheritance
interface  AA
{
	void show1();
}

interface BB extends AA
{
	void show2();
}

class CC implements AA,BB
{
	public void show1()
	{
		System.out.println("Show value of A");
	}
	public void show2()
	{
		System.out.println("Show value of B");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		CC c=new CC();
		c.show1();
		c.show2();

	}

}
