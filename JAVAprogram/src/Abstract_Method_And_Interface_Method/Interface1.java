package Abstract_Method_And_Interface_Method;
//It is used to achieve 100 %
//Complier will add abstract and public keyword implicity
//Interface is blueprint of the class and its specify what a class must do and not how
//It support multiple Inheritance
//It can be used to achieve lose coupling
//In Interface all methods are public abstract
//when creating any feild in interface it must be public static final  for ex.int a=10;  (it may public static final int a=10;)
//after java 8 version we create concrete method by using acessmodifier like default
//We also create public static methods
//after 9 version we create private methods
//interface to interface extends 
//interface to class implements 

interface  I1
{
	public abstract void show();
	/*default void run() 
	{
		
	}*/
	//(public static final) complier do implicitly int a=10;
	/*public static void run()
	{
		
	}*/
	/*private void display()
	{
		
	}*/
}

class I2 implements I1
{
	public void show()
	{
		System.out.println("1");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		I1 i=new I2();
		i.show();

	}

}
