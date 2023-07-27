package Collection;

import java.util.LinkedHashSet;
//LinkedhashSet follows insertion order
//linkedhashset object is created 16 memory block will created
//when last element is inserted memory size will doubled

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add(20);
		
		System.out.println(h);
	}

}
