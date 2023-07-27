package Control_Flow_Decision_Making_Statement;

import java.util.Scanner;

public class Nested_If_Else_Statement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ss=new Scanner(System.in);
		System.out.println("sudra prapose to Sundri");
		System.out.println("Sundri take his decision  in Yes and No ");
		char sundri=ss.next().charAt(0);
		if(sundri=='Y')
		{
			System.out.println("Sundri have confusion to his decision. So she asking her Bestfriend dori suggetion in Yes and No");
			char dori=ss.next().charAt(0);
			if(dori=='Y')
			{
				System.out.println("Sundri weds Sundra");
			}
			else
			{
				System.out.println("Sundri rejected sundra becoz of dori");
			}
		}
		else
		{
			System.out.println("Sundri take her decision to reject Sundra");
		}

	}

}
