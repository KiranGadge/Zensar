package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println("Integer arraylist:- ");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		ArrayList s = new ArrayList();
		s.add("A");
		s.add("B");
		s.add(10);
		s.add("D");
		s.add("E");
		
		System.out.println("String arraylist:- ");
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Object data =i.next();
			System.out.println(data);
		}
	
	}

}
