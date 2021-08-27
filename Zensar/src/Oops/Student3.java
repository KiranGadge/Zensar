package Oops;

public class Student3 {

	void set_info(String name,int age)
	{
		System.out.println("Name is:- "+name);
		System.out.println("Age is:- "+age);
	}
	void set_info(String name,int age,String addr)
	{
		System.out.println("Name is:- "+name);
		System.out.println("Age is:- "+age);
		System.out.println("Address is:- "+addr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 s3 = new Student3();
		s3.set_info("ABC", 40);
		s3.set_info("XYZ",50,"Junnar");
		
	}

}
