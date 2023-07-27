package String_Method_Problem;

class Object
{
	String s="Hello";
	
	public String toString()
	{
		return s;
	}
}

public class Object1 {

	public static void main(String[] args) {
		Object o=new Object();
		System.out.println(o.toString());
		o.s="Hello Qspider";
		System.out.println(o);

	}

}
