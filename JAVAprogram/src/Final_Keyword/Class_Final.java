package Final_Keyword;

//whn we make class as final we can't inheritance the class

final class I1
{
	public void run()
	{
		System.out.println("I1 is run");
	}
}

class I2 extends I1
{
	public void run()
	{
		System.out.println("I2 is run");
	}
}
public class Class_Final {

	public static void main(String[] args) {
		I1 i=new I2();
		i.run();
	}

}
