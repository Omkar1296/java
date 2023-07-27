package Abstract_Method_And_Interface_Method;
//Single level Inheritance

abstract class Father
{
	abstract public void construction();
}

class Son extends Father
{
	public void construction()
	{
		System.out.println("Consttruction is completed");
	}
	
	public void dance()
	{
		System.out.println("Son is dancing");
	}
}

public class Abstarct2 {

	public static void main(String[] args) {
	Son s=new Son();
	s.construction();
	
	Father f=new Son();  //upcasting
	f.construction();
	
	Son s1=(Son)f;   //down casting
	s1.dance();

	}

}
