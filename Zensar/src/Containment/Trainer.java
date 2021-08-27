package Containment;

public class Trainer {

	private int tid;
	private String tname;
	private long mob;
	Trainer()
	{
		
	}
	public Trainer(int tid, String tname, long mob) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mob = mob;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	
}
