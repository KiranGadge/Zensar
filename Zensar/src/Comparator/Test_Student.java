package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Test_Student {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid,percentage;String sname;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> slist = new ArrayList<>();
		
		System.out.println("How many elements do you want to insert:- ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter sid,sname and pecentage of student:- ");
			sid =sc.nextInt();
			 sname =sc.next();
			 percentage = sc.nextInt();
			slist.add(new Student(sid,sname,percentage));
		}
	
		
		Comparator<Student> stud = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if(s1.getPercentage()-s2.getPercentage()!=0)
				return s1.getPercentage()-s2.getPercentage();
				else
					return s1.getSname().compareTo(s2.getSname());
			}
			
		};
		Collections.sort(slist, stud);
		for(Student ob:slist)
		{
			System.out.println(ob);
		}
	}

}
