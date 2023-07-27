package Operator;        
//Operator are three types Unirary Secondary and Tertery
// it move left to right   <-----
public class AssignmentOp {

	public static void main(String[] args) {
		int a=10;  //(simple)
		System.out.println(a);
		
		int b=10;  //(compound)
	    b+=10;  //b+10
		System.out.println(b);
		
		int A,B,c,d;  //chained ass.op.
		A=B=c=d=20;  
		System.out.println(A);
		System.out.println(B);
		System.out.println(c);
		System.out.println(d);
		
		int w,x,y,z;
		w=x=y=z=20;
		w+= x-= y*= z/=2 ;
		System.out.println(w+" "+x+" "+y+" "+z+" ");		

	}

}
