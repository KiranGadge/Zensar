package Containment;

public class Student {

	 int id=1;
	 String name="kiran"; 
	 int b;
	 String str;
	
	 Student()
	 {
		 System.out.println("In default constructor");
		 id=2;
		 b=5;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		Student s1 = new Student();
		System.out.println(s1.b);
		System.out.println(s1.str);
		System.out.println(s1.id);
		System.out.println(s1.b);
	}

}
