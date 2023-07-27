package Non_Static;

public class Pen {
	String brand;
	String colour;
	Double price;
	
	Pen()
	{
		System.out.println("Wlcome to Shope");
	}
	
	{
		brand="montex";
	}
	public void write()
	{
		System.out.println("Pen is writting...");
	}
	
	public void details()
	{
		System.out.println("Brand of Pen is: "+brand);
		System.out.println("Colour of Pen is: "+colour);
		System.out.println("price of Pen is: "+price);
		write();
	}
}
