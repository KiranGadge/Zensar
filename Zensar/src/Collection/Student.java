package Collection;

public class Student {
private int sid;
private String same;
private float percentage;

Student()
{
	
}

public Student(int sid, String same, float percentage) {
	super();
	this.sid = sid;
	this.same = same;
	this.percentage = percentage;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSame() {
	return same;
}

public void setSame(String same) {
	this.same = same;
}

public float getPercentage() {
	return percentage;
}

public void setPercentage(float percentage) {
	this.percentage = percentage;
}

@Override
public String toString() {
	return "Student has :-sid=" + sid + ", same=" + same + ", percentage=" + percentage ;
}


}
