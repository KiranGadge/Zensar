package Hash_series;

public class Student implements Comparable<Student> {

	private int sid;
	private String sname;
	private int percentage;
	
	Student()
	{
		
	}

	public Student(int sid, String sname, int percentage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percentage = percentage;
	}

	/*
	 * public int getSid() { return sid; }
	 * 
	 * public void setSid(int sid) { this.sid = sid; }
	 * 
	 * public String getSname() { return sname; }
	 * 
	 * public void setSname(String sname) { this.sname = sname; }
	 * 
	 * public int getPercentage() { return percentage; }
	 * 
	 * public void setPercentage(int percentage) { this.percentage = percentage; }
	 */
	
	public int hashcode()
	{
		return sid;
	}
	public boolean equals(Object o)
	{
		Student s2= (Student)o;
		return this.sid==s2.sid && this.sname.equals(s2.sname);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.percentage-o.percentage;
	}

	@Override
	public String toString() {
		return "Student has--> sid=" + sid + ", sname=" + sname + ", percentage=" + percentage+":- ";
	}

}
