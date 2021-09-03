package Set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

import Hash_series.Emp;


public class Test_Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Emp,Integer> tm=new TreeMap<>(new sortBySalary());
		tm.put(new Emp(101,"ABC",90000), 90);
		tm.put(new Emp(120,"XYZ",60000), 70);
		tm.put(new Emp(100,"PQR",80000), 90);
		tm.put(new Emp(11,"STU",100000), 80);
		
		System.out.println(tm);
	}

}
 class sortBySalary implements Comparator<Emp>
{
@Override
public int compare(Emp o1, Emp o2) {
	
	if(o1.getSalary()-o2.getSalary()!=0)
	return o1.getSalary()-o2.getSalary();
	else 
		return o1.getEmpname().compareTo(o2.getEmpname());
}
}