package Collection;

import java.util.ArrayList;

public class Test_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Student> al= new ArrayList<>();
     al.add(new Student(01,"kiran",90));
     al.add(new Student(02,"Shehal",80));
     al.add(new Student(03,"Ayush",70));
     al.add(new Student(04,"Gaurav",75));
     al.add(new Student(05,"Rohan",80));
     
     al.forEach(s->System.out.println(s));
	}

}
