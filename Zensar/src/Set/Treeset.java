package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Double> ts = new TreeSet<>();
		ts.add(10.0);
		ts.add(6.3);
		ts.add(8.6);
		ts.add(5.4);
		ts.add(9.6);
		
		System.out.println("Iterate over Treeset by iterator:- ");
		Iterator<Double> i = ts.iterator();
		while(i.hasNext())
		{
			Double data = i.next();
			System.out.println(data);
		}
		
		System.out.println("Iterate over Treeset by enhanced for loop:- ");
		for(Double d:ts)
		{
			System.out.println(d);
		}
	}

}
