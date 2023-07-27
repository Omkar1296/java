package Scanner_Class;

import java.util.Scanner;

public class S4 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		//Enter Employee Details
		System.out.println("Enter Employee Name..");
		String s=ss.nextLine();
		
		System.out.println("Enter employee ID..");
		String i=ss.nextLine();
		
		System.out.println("Enter employee phone number...");
		long l=ss.nextLong();
		ss.nextLine();
		
		System.out.println("Enter employee branch...");
		String k=ss.nextLine();
		
		
		System.out.println();
		
		employeeDetails(s,l,k,i);

	}

	public static void employeeDetails(String s,long l,String k,String i) {
		System.out.println("Employee name is "+ s);
		System.out.println("Employee ID is "+ i);
		System.out.println("Employee Contact Number is "+ l);
		System.out.println("Employee Branch is "+ k);
		
		
	}

}
