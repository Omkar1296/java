package Collection;

import java.util.Set;
import java.util.TreeSet;
//TreeSet follows sorting tree
//set object is created their will be 16 memory block will created
//last element is inserted memory size will incresed by double

public class Set_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set t=new TreeSet();
		t.add(50);
		t.add(20);
		t.add(5);
		int s=20;		
		t.remove(5);
		//t.ceiling(); //uesd in exception
		System.out.println(t.contains(s));
		//System.out.println(t.first());
		//System.out.println(t.last());
		
		System.out.println(t);
		for(int i: t)  //for each loop
		{
			System.out.print(i+",");
		}
		
		
	}

}
