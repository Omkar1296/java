package Relationship_Has_A_and_IS_A;

import java.util.Scanner;

public class Has_A_Aggregesion_Association {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		PG p=new PG("HIFI","Pune",55512245,2000);
		System.out.println("Welcome to College PG");
		System.out.println("=====================");
		System.out.println("Our Pg details are");
		p.pgdetails();
		System.out.println("Do u want to join our PG");
		System.out.println("if Yes then enter Y else for No enter N");
		char c=ss.next().charAt(0);
		if(c=='Y')
		{
			ss.nextLine();
			System.out.println("Enter ur details");
			System.out.println("Enter Student Name");
			String sname=ss.nextLine();
			
			System.out.println("Enter Student Address");
			String saddress=ss.nextLine();
			System.out.println("Entr student contact number");
			long scno=ss.nextLong();
			System.out.println("Entr student parent contact number");
			long pcno=ss.nextLong();
			
			p.addmission(sname, saddress, scno, pcno);
			System.out.println("thank u for joining our PG");
			System.out.println("Do u want to see ur details");
			System.out.println("if Yes enter Y else for No enter N");
			char cs=ss.next().charAt(0);
			if(cs=='Y')
			{
				p.s.sdetails();
			}
			else if(cs=='N')
			{
				System.out.println("as ur wish");
			}
			else
			{
				System.out.println("entr invalid data");
			}
		}
		else if(c=='N')
		{
			System.out.println("if u like our PG go dicuss to parent and visit once again");
		}
		else
		{
			System.out.println("entr invalid data");
		}
		
	}

}
