package Containment;

public class Question {

	private int Q_id;
	private String Q_name;
	
	Question()
	{
		
	}

	public Question(int q_id, String q_name) {
		super();
		Q_id = q_id;
		Q_name = q_name;
	}

	public int getQ_id() {
		return Q_id;
	}

	public void setQ_id(int q_id) {
		Q_id = q_id;
	}

	public String getQ_name() {
		return Q_name;
	}

	public void setQ_name(String q_name) {
		Q_name = q_name;
	}

	@Override
	public String toString() {
		return "Question has--> Q_id=" + Q_id + ", Q_name=" + Q_name;
	}
	
	
}
