package Hash_series;

import java.util.Hashtable;
import java.util.Set;

public class Hashtable_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put("Tea",50);
		ht.put("Green tea",50);
		ht.put("Coffee",50);
		ht.put("Cold coffee",50);
		ht.put("Black coffee",50);
		
		System.out.println("Hashtable:- "+ht);
		System.out.println("Contains key:- "+ht.containsKey("Coffee"));
		System.out.println("Size:- "+ht.size());
		
				
	}

}
