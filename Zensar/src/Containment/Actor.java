package Containment;

public class Actor {
	private int actid;
	private String actorname;
	private char gender;
	
	public Actor(int actid, String actorname, char gender) {
		super();
		this.actid = actid;
		this.actorname = actorname;
		this.gender = gender;
	}


	public int getActid() {
		return actid;
	}

	public void setActid(int actid) {
		this.actid = actid;
	}

	public String getActorname() {
		return actorname;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
