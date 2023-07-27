package Operator;

public class Cond_Op_GreatestOfSix {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		a=25;b=255;c=89;d=455;e=7821;f=547;
		int k=a>b && a>c && a>d && a>e && a>f?a:
			b>c && b>d && b>e && b>f?b:
				c>d && c>e &&c>f?c:
					d>e && d>f?d:
						d>e?d:e;
		System.out.println(k);
		

	}

}
