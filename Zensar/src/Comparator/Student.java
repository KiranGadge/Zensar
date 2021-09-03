package Comparator;

public class Student {

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


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getPercentage() {
		return percentage;
	}


	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "Student has--> sid=" + sid + ", sname=" + sname + ", percentage=" + percentage ;
	}
	
	
}
