package Collection;

import java.util.ArrayList;

public class Reverse_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Reverse order:- ");
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
	}

}
