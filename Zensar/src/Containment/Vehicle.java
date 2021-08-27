package Containment;

import java.util.Scanner;

public class Vehicle {

	private int vid;
	private String vname;
	
	Vehicle()
	{
		
	}
	public Vehicle(int vid,String vname)
	{
		this.vid=vid;
		this.vname=vname;
	}
		
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Vehicle details:--vid=" + vid + ", vname=" + vname ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person id ,name:- ");
		int pid = sc.nextInt();
		String pname = sc.next();
		
		Person p =new Person();
		p.setPid(pid);
		p.setPname(pname);
		
		System.out.println("Enter vid and vname of vehicle:- ");
		int vid = sc.nextInt();
		String vname = sc.next();
		
		Vehicle v = new Vehicle();
		v.setVid(vid);
		v.setVname(vname);
		
		p.setV(v);
		
		System.out.println(p);
		
		
		
	}

}
