package Abstract_Method_And_Interface_Method;

abstract class Dinga              //Service specifier Parent classs
{
	abstract public void notes1();
	abstract public void notes2();
}

abstract class Manga extends Dinga          //service provider /Concreate class
{
	public void notes1()
	{
		System.out.println("Manga completed all notes1");
	}
}

class Sundra extends Manga        //service user
{
	public void notes2()
	{
		System.out.println("Sundra completed all notes2");
	}
	public void notes3()
	{
		System.out.println("Sundra completed all notes3");
	}
}

public class Abstract4 {

	public static void main(String[] args) {
		Sundra s=new Sundra();
		s.notes1();
		s.notes2();
		s.notes3();
	}

}
