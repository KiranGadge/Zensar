package Hash_series;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class Student2  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,Integer> hm=new HashMap<>();
		hm.put(new Student(01,"kiran",90),2020);
		hm.put(new Student(02,"gadge",80),2021);
		hm.put(new Student(03,"tejas",89),2019);
		hm.put(new Student(04,"Abc",75),2020);
		
		Set<Student> ss=hm.keySet();
		
		for(Student ob:ss)
		{
			System.out.println(ob+ " ->"+hm.get(ob));
		}

		
	}

	


}
