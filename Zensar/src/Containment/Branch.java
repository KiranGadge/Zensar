package Containment;

public class Branch {

	private int b_id;
	private String b_name;
	private Subject sub;
	
	Branch()
	{
		
	}

	public Branch(int b_id, String b_name, Subject sub) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.sub = sub;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Branch has--> b_id=" + b_id + ", b_name=" + b_name + "\n" + sub;
	}
	
}
