package Hash_series;

import java.util.Hashtable;
import java.util.Set;

public class Test_Student  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Student,Integer> hts = new Hashtable<>();
		hts.put(new Student(01,"kiran",90),2020);
		hts.put(new Student(02,"gadge",80),2021);
		hts.put(new Student(03,"tejas",89),2019);
		hts.put(new Student(04,"Abc",75),2020);
		
		Set<Student> ss = hts.keySet();
		
		for(Student ob:ss)
		{
			System.out.println(ob+" "+hts.get(ob));
		}

	}

}
