package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(01,"Coffee");
		hm.put(02,"Tea");
		hm.put(03,"Green tea");
		hm.put(04,"Black coffee");
		hm.put(01,"Cold coffee");
		
		Set<Entry<Integer,String>> ee = hm.entrySet();
		for(Entry<Integer,String> e:ee)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
