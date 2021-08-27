package Containment;

public class SubTopic {

	private int ST_id;
	private String ST_name;
	private Question Que;
	
	SubTopic()
	{
		
	}

	public SubTopic(int sT_id, String sT_name, Question que) {
		super();
		ST_id = sT_id;
		ST_name = sT_name;
		Que = que;
	}

	public int getST_id() {
		return ST_id;
	}

	public void setST_id(int sT_id) {
		ST_id = sT_id;
	}

	public String getST_name() {
		return ST_name;
	}

	public void setST_name(String sT_name) {
		ST_name = sT_name;
	}

	public Question getQue() {
		return Que;
	}

	public void setQue(Question que) {
		Que = que;
	}

	@Override
	public String toString() {
		return "SubTopic has--> ST_id=" + ST_id + ", ST_name=" + ST_name + "\n" + Que;
	}
	
	
}
