package Operator;

public class Conditional_Op {

	public static void main(String[] args) {
		int a=20;
		int b=45;
		boolean c=a>=b?true:false;  // expression?result1 :result2;
		System.out.println(c);
		
		int a1=44;
		int b1=44;
		int k=(a1==b1)?a1:b1;
		System.out.println(k);
		
		int x=55;
		int y=22;
		int z=(x>=y)&&(x<=y)?x:y;
		System.out.println(z);
		
		int g=55;
		int h=44;
		int f=(g++>=++h)||(g--<+h++)?g:h;
		System.out.println(f);
		

	}

}
