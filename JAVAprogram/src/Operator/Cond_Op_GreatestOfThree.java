package Operator;

public class Cond_Op_GreatestOfThree {

	public static void main(String[] args) {
		int n1=55;
		int n2=455;
		int n3=545;
		int k=n1>n2?n1>n3?n1:n3
		            :
		            	n2>n3?n2:n3;
		            	System.out.println(k);

	}

}
