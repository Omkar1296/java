package Control_Flow_Decision_Making_Statement;

import java.util.Scanner;

public class ElseIf_Statement {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Sundra prapose many Girls..");
		System.out.println("1st Sundra ask to Sundri..");
		System.out.println("Sundri take her decision in Yes and No....");
		char sundri=ss.next().charAt(0);
		if(sundri=='Y')
		{
			System.out.println("Sundri weds Sundra");
		}
		System.out.println("if sundri say no Sundra prapose to dori");
		System.out.println("Dori take decision in Yes and No");
		char dori=ss.next().charAt(0);
		 if(dori=='Y')
		{
			System.out.println("Dori weds Sundra");
		}
		

	}

}
