package Static;

import java.util.Scanner;

public class Library {
	static String bookName;
	static String author;
	static double price;
	
	public static void details()
	{
		System.out.println("Name of book is: "+ bookName);
		System.out.println("Author name is: "+ author);
		System.out.println("Price of book is: "+price);
	}
	
	static
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter name of Book...");
		String s=ss.nextLine();
		
		System.out.println("Enter the name of Author....");
		String a=ss.nextLine();
		
		System.out.println("Enter price of book...");
		double b=ss.nextDouble();
		
		System.out.println("Do u want see details...");
		System.out.println("If YES press Y and NO press N");
		char c=ss.next().charAt(0);
		if(c=='Y')
		{
			details();
		}
		else
		{
			System.out.println("Visit again..");
		}
	}

}
