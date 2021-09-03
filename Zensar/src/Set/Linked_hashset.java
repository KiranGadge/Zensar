package Set;

import java.util.LinkedHashSet;

public class Linked_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("kiran");
		lhs.add("gadge");
		lhs.add("BE");
		lhs.add("Computer");
		lhs.add("Developer");
		System.out.println("LinkedHashSet:- ");
		for(String s:lhs)
		{
			System.out.println(s);
		}
	}

}
