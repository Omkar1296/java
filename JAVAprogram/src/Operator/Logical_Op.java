package Operator;
//Their are three type of Logical_op
//1.AND && 2.OR || 3.Not !=

public class Logical_Op {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		boolean bb=(a<b)||(a>b);
		boolean cc=(a>b)&&(a>b);
		boolean k=a!=b;
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(k);
		
		

	}

}
