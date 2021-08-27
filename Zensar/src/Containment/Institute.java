package Containment;

public class Institute {
	
	private int Ins_id;
	private String Ins_name;
	private Branch Br;
	
	Institute()
	{
		
	}

	public Institute(int ins_id, String ins_name, Branch br) {
		super();
		Ins_id = ins_id;
		Ins_name = ins_name;
		Br = br;
	}

	public int getIns_id() {
		return Ins_id;
	}

	public void setIns_id(int ins_id) {
		Ins_id = ins_id;
	}

	public String getIns_name() {
		return Ins_name;
	}

	public void setIns_name(String ins_name) {
		Ins_name = ins_name;
	}

	public Branch getBr() {
		return Br;
	}

	public void setBr(Branch br) {
		Br = br;
	}

	@Override
	public String toString() {
		return "Institute has--> Ins_id=" + Ins_id + ", Ins_name=" + Ins_name + "\n" + Br ;
	}

	
}
