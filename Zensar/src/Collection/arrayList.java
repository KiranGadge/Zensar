package Collection;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.size());
		al.add("kiran");
		al.add("Gadge");
		al.add("A");
		al.add("B");
		al.add("C");
		
		System.out.println("Elments are:- "+al);
		System.out.println(al.size());
		//al.clear();
		//System.out.println("After clear size:- "+al);
		al.add("kiran");
		al.add("Gadge");
		System.out.println("Duplicate elements added:- "+al);
		al.remove("Gadge");//remove deletes first occurance of element. 
		System.out.println("After removing element Gadge:- "+al);
		System.out.println("Contains method:- "+al.contains("kiran"));
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Hello");
		al2.add("Welcome");
		al.addAll(al2);
		
		System.out.println("Merging two arraylists:- "+al);
		al.removeAll(al2);
		System.out.println("Remove all:- "+al);
		System.out.println("Contains all:- "+al.containsAll(al2));
		al2.add(2,"to INDIA");
		System.out.println("Add at specific index:- "+al2);
	}

}
