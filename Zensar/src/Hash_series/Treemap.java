package Hash_series;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Emp,Integer> tm=new TreeMap<>(new myEmpComparator());
		tm.put(new Emp(101,"ABC",90000), 90);
		tm.put(new Emp(120,"XYZ",60000), 70);
		tm.put(new Emp(100,"PQR",80000), 90);
		tm.put(new Emp(11,"STU",100000), 80);
		
		System.out.println(tm);
		
	}

}
class myEmpComparator implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getEmpname().compareTo(o2.getEmpname());
	}
	
} 