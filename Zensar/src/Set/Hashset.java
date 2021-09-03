package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("kiran");
		hs.add("gadge");
		hs.add("BE");
		hs.add("Computer");
		hs.add("Developer");
		
		//System.out.println("Hashset:- "+hs);
		System.out.println("Iterate ovwe hashset by enhanced for loop:- ");
		for(String s:hs)
		{
			System.out.println(s);
		}
		
		System.out.println("Iterate by iterator:- ");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			String ss=itr.next();
			System.out.println(ss);
		}
	}

}
