package Collection;

import java.util.Vector;

public class Vector_demo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("Monday");
		v.add("Tuesday");
		v.add("Wednsday");
		v.add("Thursday");
		v.add("Friday");
		v.add("Saturday");
		v.add("Sunday");
		
		System.out.println("Vector:- "+v);
		v.remove(4);
		System.out.println("After removing specific index:- "+v);
		v.capacity();
		System.out.println("Capacity of vector:- "+v);
		
		System.out.println("Contains method:- "+v.contains("Saturday"));
	}
}
