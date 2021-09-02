package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
//frequency
public class Ex_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("Blue");
		al.add("Green");
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Yellow");
		al.add("Violet");
		al.add("Blue");
		al.add("Blue");
		
		HashMap<String,Integer> hm = new HashMap<>();
		for(String color:al)
		{
			if(hm.containsKey(color))
			{
				int val =hm.get(color);
				hm.put(color,val+1);
				
			}else
			{
				hm.put(color,1);
			}
		}
		System.out.println("List:- "+hm);
		
 	}

}
