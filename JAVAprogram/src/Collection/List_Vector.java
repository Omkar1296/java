package Collection;

import java.util.Vector;

//Vector is implemented class of list interface
//Vector list is index based data structure
//Vector follows insertion order
//In vector duplictes are allowed
//Vector object is created it create 10 memory of block allocated implicitly
//when last elemnt is inserted memory block will be incresed to current size * 2

public class List_Vector {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(10);
		
		System.out.println(v);
		

	}

}
