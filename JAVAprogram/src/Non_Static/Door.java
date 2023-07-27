package Non_Static;

public class Door {
	String colour;     //Charactristics
	int size;
	String material;
	double price;
	
	Door()
	{
		System.out.println("Hello...");
	}
	static
	{
		System.out.println("---------");
	}
	

	public void open()    //Behaviour
	{
		System.out.println("Open the Door..");
	}
	
	public void close()
	{
		System.out.println("Close the Door...");
	}
	
	public void details()
	{
		System.out.println("Colour of the door is: "+ colour);
		System.out.println("Size of the door is: "+ size);
		System.out.println("Material of the door is: "+ material);
		System.out.println("Price of the door is: "+ price);
		open();
		close();
	}
	
}
