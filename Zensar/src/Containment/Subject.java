package Containment;

public class Subject {

	private int sub_id;
	private String sub_name;
	private Topic topic;
	
	Subject()
	{
		
	}

	public Subject(int sub_id, String sub_name, Topic topic) {
		super();
		this.sub_id = sub_id;
		this.sub_name = sub_name;
		this.topic = topic;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Subject has--> sub_id=" + sub_id + ", sub_name=" + sub_name + "\n" + topic;
	}
	
}
