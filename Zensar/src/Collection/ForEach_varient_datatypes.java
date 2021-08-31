package Collection;

import java.util.ArrayList;

public class ForEach_varient_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add("kiran");
		ar.add(10.0f);
		ar.add(15.4d);
		ar.add(true);
		
		System.out.println("ForEach method:-");
		ar.forEach(t->System.out.println(t));
	}

}
