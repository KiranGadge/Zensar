package Containment;

public class Topic {

	private int T_id;
	private String T_name;
	private SubTopic ST;
	
	Topic()
	{
		
	}

	public Topic(int t_id, String t_name, SubTopic sT) {
		super();
		T_id = t_id;
		T_name = t_name;
		ST = sT;
	}

	public int getT_id() {
		return T_id;
	}

	public void setT_id(int t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

	public SubTopic getST() {
		return ST;
	}

	public void setST(SubTopic sT) {
		ST = sT;
	}

	@Override
	public String toString() {
		return "Topic has--> T_id=" + T_id + ", T_name=" + T_name + "\n" + ST;
	}
	
	
}
