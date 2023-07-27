package Operator;

public class Cond_Op_GreatestOfFour {

	public static void main(String[] args) {
		int a=45;
		int b=5;
		int c=554;
		int d=89;
		int k=a>b && a>c && a>d?a:
			b>c && b>d?b:
				c>d?c:d;
				
	System.out.println(k);

	}

}
