package Practise;
//type casting have two types
//1.primitive which consist of ---Widening  and   Narrowing
//2.Non primitive which consist of ---- upcasting and downcasting
//byte < short < int < long < float < double < char < boolean
public class Type_Casting1 {

	public static void main(String[] args) {
		//byte b=127;
		//int i=b;
		//System.out.println(i);   //Primitive type casting----Widening  (ex.maruti to BMW)
		
		int i=65;
		char c=(char) i;  //Narrowing
		System.out.println(c);
	}

}
