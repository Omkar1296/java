package Collection;

import java.util.LinkedList;
import java.util.List;
//Linked list is implemented class of list interface and deque
//Linked list is also called as doubly linked list or circular linked list
//Linked follows insertion order
//Linkedlist object is created memory block are not created
//Each memoery block is divied into 3 nodes
//1st node consist of previous node address
//Second node store element
//3rd node consist of next node address
//Adding and removing elemnt at last is tough and more time consuming
//Adding and removing elemnt in between is easy and less time consuming



public class List_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new LinkedList();
		l.add(10);
		l.add(10);
		l.add(null);
		l.add(null);
	
		int hash = l.hashCode();
		System.out.println(hash);
		System.out.println(l);
		
		List k=new LinkedList();
		k.add(10);
		k.add(20);
		k.add(50);
		
		System.out.println(k);
		
	if(l.equals(k))
	{
		System.out.println("Equals");
	}
	else
	{
		System.out.println("Not Equals");
	}

	}

}
