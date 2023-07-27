package Method_OverRidding;
//The method consist of same name,Method present in different class, method signature consist of same no. of argument and same data type,and same sequence
// it is possible when their is IS-A relationship

class Parent
{
	int i=20;
	public void show()
	{
		System.out.println("Show in parent class");
	}
}

class Child extends Parent
{
	int i=30;
	public void show()             //Method Overridden with same name with no argument
	{
		System.out.println("Show in Child class");
	}
}
public class Over_Ridding {

	public static void main(String[] args) {
		Parent p=new Child();            //implicity upcasting
		System.out.println(p.i);
		System.out.println(p.i);
		p.show();
		
		Child c=new Child();
		c.show();
		
		c=(Child)p;      //explicitly   downcasting
		c.show();
		System.out.println(c.i);
		
		p=new Parent();
		p.show();
	}

}
