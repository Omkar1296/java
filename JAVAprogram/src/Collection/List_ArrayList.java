package Collection;

import java.util.ArrayList;
import java.util.Iterator;


//Collection is interface...It is single entity which create object/ store multiple non primitive data
//Collection framework --it is predefined API which consist of all classes and Interface which create object/single entity represnts store multiple data 
//collections(Utility class)--It is utility class which consist of only static method
//list is also interface......and arraylist and linkedlist is class .....and vector and stack is legaecy class
//Iterator is cursor which helps to give value one by one  it has two types iterator() and Linkediterator()

public class List_ArrayList {
	public static void main(String []arg)
	{
		ArrayList al=new ArrayList();
		al.add(0,10);
		al.add("Omkar");
		al.add(50);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		//al.remove(0);
		//System.out.println(al);
		//System.out.println(al.get(0));
		//System.out.println(al.getClass());
		
		/*ArrayList a=new ArrayList();
		a.add(50);
		a.add(20);
		a.add("ramesh");
		
		System.out.println(a);
		
		al.addAll(a);
		System.out.println(al);
		*/
		//ArrayList cloneNumber=(ArrayList)al.clone();   //create a copy of the array
		
		
		//System.out.println(cloneNumber);
		/*Iterator i=al.iterator();    // iterator() is method al is refernce variable
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
	}
}
