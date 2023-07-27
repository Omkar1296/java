package Control_Flow_Decision_Making_Statement;

import java.util.Scanner;

public class If_Else_Statement2 {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Sundra prapose to Sundri..");
		System.out.println("Sundri give her decision in Yes and No..");
		char c=ss.next().charAt(0);
		if (c=='Y')
		{
			System.out.println("They are in love..");
		}
		
		else
		{
			System.out.println("They are not in love..");
		}
		
		

	}

}
