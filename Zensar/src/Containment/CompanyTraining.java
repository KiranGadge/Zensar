package Containment;

public class CompanyTraining {

	private int cid;
	private String compname;
	private Trainer t;
	
	 CompanyTraining()
	{
		
	}

	public CompanyTraining(int cid, String compname, Trainer t) {
		super();
		this.cid = cid;
		this.compname = compname;
		this.t = t;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public Trainer getT() {
		return t;
	}

	public void setT(Trainer t) {
		this.t = t;
	}
	
}
