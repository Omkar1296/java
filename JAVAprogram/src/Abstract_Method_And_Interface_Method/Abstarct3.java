package Abstract_Method_And_Interface_Method;

//Multi Level Inheritance

abstract class Species   //parent class
{
	abstract public void climb();
	abstract public void fly();
}

 abstract class Monkey extends Species
{
	public void climb()
	{
		System.out.println("Monkey climb on tree");
	}

	
}

class Bird extends Monkey
{
	public void fly()
	{
		System.out.println("birds fly in sky");
	}
}


public class Abstarct3 {

	public static void main(String[] args) {
		Species s=new Bird();
		s.climb();
		s.fly(); 
		
		
		

	}

}
