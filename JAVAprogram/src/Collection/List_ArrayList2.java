package Collection;

import java.util.ArrayList;
//Array list is implemented class of list interface
//Array list is index based data structure
//ArrayList follows insertion order
//Arraylist object is created it create 10 memory of block allocated implicitly
//when last elemnt is inserted memory block will be incresed to current size / 2
//Arraylist can store hetrogenus data 
//It allows duplicate values
//It allows any number of null values

import java.util.List;

public class List_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(0,10);
		l.add(20);
		l.add(50.45);
		l.add(true);
		l.add(null);
		l.add(null);
		l.add("rakesh");
		
		List k=new ArrayList();
		k.add("om");
	
		l.addAll(k);
		System.out.println(l);
	}

}
