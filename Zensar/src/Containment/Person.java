package Containment;

public class Person {

	private int pid;
	private String pname;
	private Vehicle v;
	
	Person(){
		
	}
	public Person(int pid, String pname, Vehicle v) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.v = v;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "Person details:--pid=" + pid + ", pname=" + pname + ", v=" + v ;
	}
	
	
	
	
}
