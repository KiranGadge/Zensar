package Containment;

public class Emp {

	private int eid;
	private String name;
	private int salary;
	private Department dept;
	
	public Emp(int eid, String name, int salary, Department dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Emp()
	{
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}

