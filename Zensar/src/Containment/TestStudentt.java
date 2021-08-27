package Containment;

import java.util.Scanner;

public class TestStudentt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sid , sname,MOB,PassOutYear:- ");
		int sid = sc.nextInt();
		String sname = sc.next();
		long mob = sc.nextLong();
		int PassOutYear = sc.nextInt();
		
		Studentt st = new Studentt();
		st.setSid(sid);
		st.setSname(sname);
		st.setMob(mob);
		st.setPassOutYear(PassOutYear);
		
		System.out.println("Enter cid,compname:-");
		int cid = sc.nextInt();
		String compname = sc.next();
		
		CompanyTraining ct = new CompanyTraining();
		ct.setCid(cid);
		ct.setCompname(compname);
		st.setCt(ct);
	
		
		System.out.println("Enter tid ,tname,Mob:-");
		int tid = sc.nextInt();
		String tname = sc.next();
		long mob1 = sc.nextLong();
		
		Trainer t = new Trainer();
		t.setTid(tid);
		t.setTname(tname);
		t.setMob(mob1);
		ct.setT(t);
		
		System.out.println("sid is :- "+st.getSid());
		System.out.println("sname is:- "+st.getSname());
		System.out.println("Mob of student:- "+st.getMob());
		System.out.println("Pass out year:-"+st.getPassOutYear());
		System.out.println("Cid is:- "+st.getCt().getCid());
		System.out.println("Company name :- "+st.getCt().getCompname());
		System.out.println("Tid is:- "+st.getCt().getT().getTid());
		System.out.println("Trainer name is:- "+st.getCt().getT().getTname());
		System.out.println("Trainer MOB is:- "+st.getCt().getT().getMob());
		
		
	}

}
