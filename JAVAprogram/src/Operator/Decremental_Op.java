package Operator;
//Decremental op have two type  post (p--)and pre(--p)
public class Decremental_Op {

	public static void main(String[] args) {
		int a=50;
		int b=--a;
		int c=b--;
		System.out.println(a);//49
		System.out.println(b);//48
		System.out.println(c);//49
		System.out.println(--a);//48
		System.out.println(b--);//48
		System.out.println(--c);//48
		System.out.println(++c);//49
		
		
		

	}

}
