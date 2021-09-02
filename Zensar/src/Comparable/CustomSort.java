package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> al=new ArrayList<>();
		al.add(new Student1("A", "BE",9766646343l,90));
		al.add(new Student1("FF", "BE",9175900787l,89));
		al.add(new Student1("E", "BE",9766646343l,91));
		al.add(new Student1("CCCC", "BE",9175900767l,92));
		al.add(new Student1("BBB", "BE",9766646343l,93));
		al.add(new Student1("D", "BE",9175900767l,90));
		
		
		Collections.sort(al);
		
		for(Student1 ob:al)
			System.out.println(ob);


	}

}
