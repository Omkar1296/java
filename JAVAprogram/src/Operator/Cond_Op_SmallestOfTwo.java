package Operator;

public class Cond_Op_SmallestOfTwo {

	public static void main(String[] args) {
		int a=2;
		int b=22;
		int c=5;
		int k=a<b?a<c?a:c:
			b<c?b:c;
		System.out.println(k);

	}

}
