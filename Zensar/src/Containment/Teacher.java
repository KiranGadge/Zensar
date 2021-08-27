package Containment;

public abstract class Teacher {

	private int tid;
	private String tname;
	private long mob;
	
	Teacher()
	{
		
	}

	public Teacher(int tid, String tname, long mob) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.mob = mob;
	}
	
	abstract void salary();
	
	
}
