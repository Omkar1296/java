package Data_Hiding_Encapsulation;

import java.util.Scanner;

public class ADrivers {
	public static void main(String[]arg)
	{
	Scanner ss=new Scanner(System.in);
	Accounts a=new Accounts();
	System.out.println("Wlcome to bank...");
	System.out.println("Enter Account holder Name");
	String s=ss.nextLine();
	System.out.println("Enter Account holder Account Number");
	long l=ss.nextLong();
	System.out.println("Enter Account holder Balance");
	double d=ss.nextDouble();
	
	a.setName(s);
	a.setAccountNo(l);
	a.setBal(d);
	a.details();
	System.out.println();
	System.out.println("Do u want to withdraw amount enter W and for deposite enterd D");
	char c=ss.next().charAt(0);
	if(c=='W')
	{
		System.out.println("enter the pin..");
		int pin=ss.nextInt();
		System.out.println("Enter the cash to be Withdraw");
		double amt=ss.nextDouble();
		a.withdraw(pin, amt);
		System.out.println();
		a.details();
		System.out.println();
	}
	else if(c=='D')
	{
		System.out.println("enter the pin..");
		int pin=ss.nextInt();
		System.out.println("Enter the cash to be Deposite");
		double amt=ss.nextDouble();
		a.deposite(pin, amt);
		System.out.println();
		a.details();
		System.out.println();
		System.out.println("Thank for using me...");
	}
	else
	{
		System.out.println("k have nice day...");
	}
	
	}
}
