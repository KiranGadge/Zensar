package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Basic_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(01,"Coffee");
		hm.put(02,"Tea");
		hm.put(03,"Green tea");
		hm.put(04,"Black coffee");
		hm.put(01,"Cold coffee");
		
		System.out.println("Hashmap--> "+hm);
		
		System.out.println("Get value of specific key:- "+hm.get(3));
		System.out.println("Size of hashmap:- "+hm.size());
		System.out.println("Set of all keys in hashmap:- "+hm.keySet());
		System.out.println("Contains value:- "+hm.containsValue("Cold coffee"));
		System.out.println("Containns key:- "+hm.containsKey(6));
		System.out.println("Hashmap using forEach method:- ");
		hm.forEach((k,v)->System.out.println("Key-> "+k+" value-> "+v));
		
	}

}
