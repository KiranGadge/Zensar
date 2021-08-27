package Containment;

import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movieid:- ");
		int mid = sc.nextInt();
		System.out.println("Enter movie name:- ");
		String mname = sc.next();
		
		m.setMovieid(mid);
		m.setMoviename(mname);
		
		System.out.println("Enter actor id and actor name and gender:- ");
		int aid = sc.nextInt();
		String aname = sc.next();
		char g = sc.next().charAt(0);
		
		Actor a = new Actor(aid,aname,g);
		m.setActor(a);
		

		System.out.println("Movie id is:- "+m.getMovieid());
		System.out.println("Movie name is:- "+m.getMoviename());
		System.out.println("Actor id is:- "+m.getActor().getActid());
		System.out.println("Actor name is:- "+m.getActor().getActorname());
		System.out.println("Gender of actor is:- "+m.getActor().getGender());
		
	}

}

