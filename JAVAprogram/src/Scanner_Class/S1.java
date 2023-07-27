package Scanner_Class;
//Scanner class uesd for take input from user and read it dynamically
// import scanner class import java.util.Scanner;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		//Enter Student data
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter student Name ....");
		String s=ss.nextLine();
		
		System.out.println("Enter student Age..");
		int i=ss.nextInt();
		
		System.out.println("Enter Student Phone Number..");
		long l=ss.nextLong();
		
		studentDetails(s, i, l);

	}

	public static void studentDetails(String s,int i,long l) {
		System.out.println("Student Name is "+ s);
		System.out.println("Student Age is "+ i);
		System.out.println("Student PnoneNumber is "+ l);
		
	}

}
