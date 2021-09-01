package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_coll {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("kiran");
		al.add("gadge");
		al.add("Megha");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("Priya");
		al.add("Om");
		al.add("Ayush");
		al.add("A");
		al.add("A");
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		int c=Collections.frequency(al,"A");
		System.out.println("Frequency of A:- "+c);
		
		System.out.println("Shuffle:- ");
		Collections.shuffle(al);
		
		System.out.println(al);
		
		System.out.println("Swap:- ");
		Collections.swap(al,0 , 2);
		System.out.println(al);
		
		System.out.println("Sort:- ");
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
	}

}
