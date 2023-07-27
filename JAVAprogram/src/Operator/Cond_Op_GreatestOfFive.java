package Operator;

public class Cond_Op_GreatestOfFive {

	public static void main(String[] args) {
		int a=45;
		int b=458;
		int c=584;
		int d=888;
		int e=22;
		int k=a>b && a>c && a>d && a>e?a:
			b>c && b>d && b>e?b:
				c>d && c>e?c:d;
		System.out.println(k)       ;

	}

}
