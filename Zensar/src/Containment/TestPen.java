package Containment;

import java.util.Scanner;

public class TestPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pen details- brand and caplength:- ");
		String brand = sc.next();
		int capl = sc.nextInt();
		
		Pen p = new Pen();
		p.setBrand(brand);
		p.setCaplength(capl);
		
		System.out.println("Enter Refill details- inkcolor,length:- ");
		String inkcolor = sc.next();
		int Refill_l = sc.nextInt();
		
		Refill r= new Refill();
		r.setInkcolor(inkcolor);
		r.setLength(Refill_l);
		p.setR(r);
		
		System.out.println("Enter Nib details- material and width:- ");
		String material = sc.next();
		int width = sc.nextInt();
		
		Nib n = new Nib();
		n.setMaterial(material);
		n.setWidth(width);
		r.setNib(n);
		

		System.out.println(p);
	}

}
