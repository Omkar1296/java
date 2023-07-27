package Use_of_SuperKeyword;
//super() can be uesd to invoke immediate parent class constructor

class E
{
	E()
	{
		System.out.println("I am in class A");
	}
}
class F extends E
{
	F()
	{
		super();                                             //super() is uesd only in constructor
		System.out.println("I am in class B");
	}
}

public class Super3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f=new F();
	}

}
