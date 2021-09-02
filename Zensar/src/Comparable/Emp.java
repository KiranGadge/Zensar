package Comparable;

public class Emp implements Comparable<Emp> {
	private int empid;
	private String empname;
	private String  deptname;
	private int salry;
	
	Emp()
	{
		
	}

	public Emp(int empid, String empname, String deptname, int salry) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptname = deptname;
		this.salry = salry;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getSalry() {
		return salry;
	}

	public void setSalry(int salry) {
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "Emp has--> empid=" + empid + ", empname=" + empname + ", deptname=" + deptname + ", salry=" + salry ;
	}

	/*public int compareTo(Emp em)
	{
		if(em.deptname.length()>this.deptname.length())
			return +1;
		else if (em.deptname.length()<this.deptname.length())
	     return -1;
		else
			return 0;
	}*/
	public int compareTo(Emp em)
	{
		if(em.getSalry()-this.getSalry()!=0)
			return em.getSalry()-this.getSalry();
		else
			return this.getEmpname().compareTo(em.getEmpname());
	}
	
}
