package UpCasting_DownCasting_IS_A;

class Parent
{
	int i=20;
	public void show()
	{
		System.out.println("Show");
	}
}

class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("hello");
	}
	int j=30;
	public void display()
	{
		System.out.println("Display");
	}
	
}

public class Upcasting {

	public static void main(String[] args) {
		/*Parent p=new Parent();
		System.out.println(p.i);
		p.show();
		
		System.out.println();
		Child c=new Child();
		System.out.println(c.j);
		c.display();
		System.out.println(c.i);
		c.show();
		*/
		
		Parent p=new Child();                //UpCasting          means refernce variable of parent class assign with Child object
		System.out.println(p.i);
		p.show();
	
		
		Child c=(Child) p;                  //Down Casting         means refernce variable of Child class assign with Parent Refernce variable narrowing (child)
		System.out.println(c.j);
		c.display();
		System.out.println(c.i);
		c.show();

	}

}
