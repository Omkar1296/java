package Non_Static;

public class Libaray {
	String name;
	String author;
	int pages;
	int pagess;
	double price;
	
	Libaray()
	{
		System.out.println("Wlcome to BookShope..");
	}
	static{
		System.out.println("--------------------");
	}
	
	public void write()
	{
		System.out.println(author+" is writing "+ pages+" pages of "+name);
	}
	
	public void close()
	{
		System.out.println(author+" is completed "+ pagess+" pages of "+name);
	}
	
	public void details()
	{
		System.out.println("Wlcome");
		System.out.println("Name of Book is: "+ name);
		System.out.println("Author of Book is: "+ author);
		System.out.println("Pages of Book is: "+ pages);
		System.out.println("Completed pages of Book is: "+ pagess);
		System.out.println("Prize of Book is: "+ price);
		write();
		close();
		System.out.println("Visit again......");
		
	}

}
