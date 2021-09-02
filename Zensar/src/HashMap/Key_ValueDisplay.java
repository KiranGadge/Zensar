package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Key_ValueDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(01,"Coffee");
		hm.put(02,"Tea");
		hm.put(03,"Green tea");
		hm.put(04,"Black coffee");
		hm.put(01,"Cold drink");
		
		System.out.println("Key and value:- ");
		Set<Integer> kk =hm.keySet();
		for(Integer i:kk)
		{
			System.out.println("Key--> "+i+" value--> "+hm.get(i));
		}
		System.out.println(kk);
		System.out.println("Using Iterator--> ");
		Iterator<Integer> itr = kk.iterator();
		while(itr.hasNext())
		{
			int j=itr.next();
			System.out.println("key-> "+j+" value-> "+hm.get(j));
		}
		
	}

}
