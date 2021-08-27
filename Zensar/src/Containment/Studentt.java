package Containment;

public class Studentt {
	private int sid;
	private String sname; 
	private long mob;
	private int PassOutYear;
	private CompanyTraining ct;
	
	public Studentt()
	{
		
	}

	public Studentt(int sid, String sname, long mob, int passOutYear, CompanyTraining ct) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mob = mob;
		PassOutYear = passOutYear;
		this.ct = ct;
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

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public int getPassOutYear() {
		return PassOutYear;
	}

	public void setPassOutYear(int passOutYear) {
		PassOutYear = passOutYear;
	}

	public CompanyTraining getCt() {
		return ct;
	}

	public void setCt(CompanyTraining ct) {
		this.ct = ct;
	}
	
	

}
