package Practise;

public abstract class Type_Casting2 {

	public static void main(String[] args) {
		int i=1225;
		byte b=(byte) i;     //Narrowing --(ex.BMW to Maruti forcefully done )
		System.out.println(b);
		
		char c='A';
		int ii=c;
		System.out.println(ii);  // widening

	}

}
