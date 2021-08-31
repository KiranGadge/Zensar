package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		System.out.println("Converting arraylist to array:- ");
		Object [] A = l.toArray();
		for(Object obj:A)
			System.out.println(obj+" ");
		
		System.out.println("Converting array to arraylist:- ");
		List<Object> l2 = new ArrayList<>();
		l2=Arrays.asList(A);
		System.out.println(l2);
		}

}
