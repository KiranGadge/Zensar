package Comparable;

public class Student1 implements Comparable<Student1>
{
	private String name;
	private String qualification;
	private long mobile;
	private int percent;
	
public Student1() {
		
	}

	public Student1(String name, String qualification, long mobile, int percent) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.mobile = mobile;
		this.percent = percent;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student has--> name=" + name + ", qualification=" + qualification + ", mobile=" + mobile + ", percent="
				+ percent ;
	}

	
	public int compareTo(Student1 o) {
	
		if(o.percent<this.percent)
			return -1;
		else if(o.percent>this.percent)
			return +1;
		else 
			return 0;
			
		
		
	}
}