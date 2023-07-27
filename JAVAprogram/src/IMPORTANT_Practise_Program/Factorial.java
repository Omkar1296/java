package IMPORTANT_Practise_Program;
//factorial means 5!=5*4*3*2*1=120
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=ss.nextInt();
		int i=1;
		int fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial for "+ n + " is "+ fact);

	}

}
                                                                                              