package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Iteration_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(01,"Coffee");
		hm.put(02,"Tea");
		hm.put(03,"Green tea");
		hm.put(04,"Black coffee");
		hm.put(01,"Cold coffee");
		
		
		Set<Integer> kk=hm.keySet();
		System.out.println(kk);
		System.out.println("Iterate over Map by enhanced for loop:- ");
		for(Integer k:kk)
			System.out.println(k+ "->"+hm.get(k));
		
		
		System.out.println("Iterate over Map by Entry object:- ");
		Set<Entry<Integer,String>> ee=hm.entrySet();
		
		for(Entry<Integer,String> e:ee)
		{
			System.out.println(e.getKey() + "-->"+e.getValue());
		}
		
		
		System.out.println("Iterate over values of map:- ");
		
		Collection<String> c=hm.values();
		
		for(String s:c)
			System.out.println(s);
		

	}

}
