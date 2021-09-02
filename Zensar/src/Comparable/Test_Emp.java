package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Emp> e = new ArrayList<>();
		e.add(new Emp(01,"A","Testing",80000));
		e.add(new Emp(03,"Z","Development",90000));
		e.add(new Emp(05,"C","UI",80000));
		e.add(new Emp(02,"P","Testing",90000));
		e.add(new Emp(04,"T","Deployement",50000));
		
		Collections.sort(e);
		for(Emp ob:e)
		{
			System.out.println(ob);
		}
	}

}

