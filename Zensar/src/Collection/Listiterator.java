package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.size());
		al.add("kiran");
		al.add("Gadge");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ListIterator <String> ltr = al.listIterator();
		System.out.println("Order using hasNext method:- ");
		while(ltr.hasNext())
		{
			String data = ltr.next();
			System.out.println(data);
		}
		System.out.println("Reverse order using hasPrevious method:- ");
		while(ltr.hasPrevious())
		{
			String data1 =ltr.previous();
			System.out.println(data1);
		}
	}

}
