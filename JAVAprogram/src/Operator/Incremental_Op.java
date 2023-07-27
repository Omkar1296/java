package Operator;
//thier are two type of Incremental op 1.Post (a++  first use and then pay) and 2.Pre (++a first use then pay)
public class Incremental_Op {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a++);  //10
		System.out.println(++a);  //12
		
		int a1=20;
		int b=a1++; 
		int c=++b; 
		System.out.println(a1);//21
		System.out.println(b);//21
		System.out.println(c);//21
		System.out.println(++a1);//22
		System.out.println(b++);//21
		System.out.println(c++);//21
		
		System.out.println();
		
		int x=30;
		int y=++x;
		int z=20+(y++);
		System.out.println(x);//31
		System.out.println(y);//32
		System.out.println(z);//51
		System.out.println(x++);//31
		System.out.println(++y);//33
		System.out.println(z++);//51
		
		
		
		

	}

}
