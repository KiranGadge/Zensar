package Hash_series;
import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap <Integer,String> lhm= new LinkedHashMap<>();
		lhm.put(1,"Mango");
		lhm.put(2,"Apple");
		lhm.put(3,"Strawberry");
		lhm.put(4,"Banana");
		lhm.put(5,"Cherry");
		System.out.println("Linked hashmap:- "+lhm);
		
		System.out.println("Keyset:- "+lhm.keySet());
		System.out.println("Contains key:- "+lhm.containsKey(7));
		System.out.println("Contains value:- "+lhm.containsValue("Strawberry"));
		System.out.println("Get value:- "+lhm.get(1));
		System.out.println("Size:- "+lhm.size());
	}

}
