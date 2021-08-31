package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		System.out.println("List:- "+al);
		
		Iterator<String> i = al.iterator();
		System.out.println("Getting elements by Iterator:- ");
		while(i.hasNext())
		{
			String data =i.next();
			System.out.println(data);
		}
		
	}

}
