package Final_Keyword;

//When we make method as final, method overriding is not possible
class Demo
{
	public final void show()
	{
		System.out.println("show is implementing in Demo");
	}
}
class Display extends Demo
{
	public void show()
	{
		System.out.println("show is implementing in Demo");
	}
}

public class Method_Final {

	public static void main(String[] args) {
		Demo d=new Display();
		d.show();

	}

}
