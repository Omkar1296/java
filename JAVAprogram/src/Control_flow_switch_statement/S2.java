package Control_flow_switch_statement;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter char value");
		char c=ss.next().charAt(0);
		switch(c) {
		case'M':
		{
			System.out.println("Monday is headche");
		}
		break;
		case'T':
		{
			System.out.println("Tuseday is Trip day");
			break;
		}
		case'W':
		{
			System.out.println("Wedensday is KFC day");
		}
		break;
		default:
		{
			System.out.println("Invalid Input");
		}
		}

	}

}
