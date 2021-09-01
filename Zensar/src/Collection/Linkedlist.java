package Collection;

import java.util.LinkedList;

public class Linkedlist {
			
	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.remove(new Integer(50));
		
		System.out.println(ll);
		
	}

}
