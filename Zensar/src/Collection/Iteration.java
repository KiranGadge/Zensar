package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

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
		System.out.println("For loop :- ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Enhanced for loop :- ");
		for(String str :al)
		{
			System.out.println(str);
		}
		System.out.println("Iterator:- ");
		Iterator <String> i =al.iterator();
		while(i.hasNext())
		{
			String data=i.next();
			System.out.println(data);
		}
		

		

	}

}
