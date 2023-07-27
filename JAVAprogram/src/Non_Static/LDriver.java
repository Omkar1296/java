package Non_Static;
import java.util.Scanner;

public class LDriver {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		Libaray l=new Libaray();
		System.out.println("-------------------");
		System.out.println("Enter the name Of Book");
		l.name=ss.nextLine();
		System.out.println("Enter the name Of Book Author");
		l.author=ss.nextLine();
		System.out.println("Enter the pages Of Book");
		l.pages=ss.nextInt();
		ss.nextLine();
		System.out.println("Enter the pages Of Book Completed..");
		l.pagess=ss.nextInt();
		System.out.println("Enter the Price Of Book");
		l.price=ss.nextDouble();
		
		System.out.println("Do u want see details if 'Yes' then press 'Y' else press 'N' for 'NO'");
		char c=ss.next().charAt(0);
		if(c=='Y')
		{
			l.details();
		}
		else
		{
			System.out.println("Thank You");
		}
		
		Libaray l1=new Libaray();
		System.out.println("Enter the name Of Book");
		l1.name=ss.nextLine();
		ss.nextLine();
		System.out.println("Enter the name Of Book Author");
		l1.author=ss.nextLine();
		System.out.println("Enter the pages Of Book");
		l1.pages=ss.nextInt();
		ss.nextLine();
		System.out.println("Enter the pages Of Book Completed..");
		l1.pagess=ss.nextInt();
		System.out.println("Enter the Price Of Book");
		l1.price=ss.nextDouble();
		
		System.out.println("Do u want see details if 'Yes' then press 'Y' else press 'N' for 'NO'");
		char c2=ss.next().charAt(0);
		if(c2=='Y')
		{
			l1.details();
		}
		else
		{
			System.out.println("Thank You");
		}
		}

}
