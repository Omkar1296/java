package Six_waysToUse_This_Keyword;
//this keyword can be used to pass as an argument in the constructor call
class Test
{
	Test(This5 t)
	{
		System.out.println("test class constructor");
	}
}

public class This5 {
	public void m1()
	{
		Test t=new Test(this);
	}

	public static void main(String[] args) {
		This5 t=new This5();
		t.m1();

	}

}
