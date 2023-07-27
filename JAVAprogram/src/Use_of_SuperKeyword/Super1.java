package Use_of_SuperKeyword;
//"super" keyword can be uesd to refer immediate parent class instance variable

class A                       //parent class
{
	int i=10;
}

class B extends A              //child class extends parent class
{
	int i=20;
	public void show(int i)
	{
		System.out.println(i);    //30
		System.out.println(this.i);//20
		System.out.println(super.i);
	}
}

public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.show(50);

	}

}
