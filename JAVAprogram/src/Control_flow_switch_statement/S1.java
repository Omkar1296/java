package Control_flow_switch_statement;
//it is similar to if-else statement
//used to defined for multiple case

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the string value..");
		String s=ss.nextLine();
		switch(s) {
		case"Monday":
		{
			System.out.println("Monday is Headche");
		}
		break;
		case"Tuseday":
		{
			System.out.println("Holiday taken");
		}
		break;
		case"Wedensday":
		{
			System.out.println("Wedensday is KFC day");
		}
		break;
		default:
		{
			System.out.println("Invalid Inaput");
		}
		}
		
		}

}
