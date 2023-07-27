package Collection;

import java.util.PriorityQueue;
import java.util.Queue;
//priority quene follows min heap order
//it consist of one root node and one child node

public class Quene_PriorityQuene {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		q.add(20);
		q.add(10);
		q.add(5);
		q.add(2);
		q.add(15);
		q.remove();     //we use remove() method the best element is removed
		
		System.out.println(q);  //[5, 15, 10, 20]

	}

}
