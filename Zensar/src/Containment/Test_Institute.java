package Containment;

import java.util.Scanner;

public class Test_Institute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Institute id and name:- ");
		int Ins_id = sc.nextInt();
		String Ins_name = sc.next();
		
		Institute i = new Institute();
		i.setIns_id(Ins_id);
		i.setIns_name(Ins_name);
		
		System.out.println("ENter Branch id and name:- ");
		int B_id = sc.nextInt();
		String B_name = sc.next();
		
		Branch b = new Branch();
		b.setB_id(B_id);
		b.setB_name(B_name);
		i.setBr(b);
		
		System.out.println("Enter Subject is and name:- ");
		int sub_id = sc.nextInt();
		String sub_name = sc.next();
		
		Subject s = new Subject();
		s.setSub_id(sub_id);
		s.setSub_name(sub_name);
		b.setSub(s);
		
		System.out.println("Enter Topic is and name:- ");
		int T_id = sc.nextInt();
		String T_name = sc.next();
		
		Topic t = new Topic();
		t.setT_id(T_id);
		t.setT_name(T_name);
		s.setTopic(t);
		
		System.out.println("Enter Sub topic is and name:- ");
		int ST_id = sc.nextInt();
		String ST_name = sc.next();
		
		SubTopic st = new SubTopic();
		st.setST_id(ST_id);
		st.setST_name(ST_name);
		t.setST(st);
		
		System.out.println("Enter Question id and name:- ");
		int Q_id = sc.nextInt();
		String Q_name = sc.next();
		
		Question q = new Question();
		q.setQ_id(Q_id);
		q.setQ_name(Q_name);
		st.setQue(q);
		
		System.out.println(i);
	}

}
