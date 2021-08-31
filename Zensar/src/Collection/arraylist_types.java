package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("For loop:- ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		ArrayList<Float> fl = new ArrayList<>();
		fl.add(10.0f);
		fl.add(20.0f);
		fl.add(30.0f);
		fl.add(40.0f);
		fl.add(50.0f);
		
		System.out.println("Iterator :- ");
		Iterator<Float> itr = fl.iterator();
		while(itr.hasNext())
		{
			Float data=itr.next();
			System.out.println(data);
		}
		
	}

}
