package Collection;

import java.util.HashSet;
//HashSet is implemented class of set interface
//hashSet follows hashing order
//duplicate values are not allowed
//hashset object is created 16 memory of block is created
//When add() method is called implicitly hashCode() method is called
//last element is inserted memory size will be doubled

public class Set_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h=new HashSet();
		h.add(20);
		h.add(50);
		h.add(20);
		h.add(10);
		h.add(null);
		h.add(5);
		h.add("om");
		int hash = h.hashCode();
		
		System.out.println(h);
		System.out.println(hash);

	}

}
