package Containment;

public class Student2 {

	public int rollno;
	protected char admissionno;
	int age;
	private String coursefield;
	
	public void doPublic()
	{
		System.out.println("In doPublic method");
	}
	
	 void doDefault()
	{
		 System.out.println("In doDefault method");
	}
	 protected void doProtected()
	 {
		 System.out.println("In doProtected method");
	 }
	 private void doPrivate()
	 {
		 System.out.println("In doPrivate method");
	 }
}
