package Oops;

import java.util.Scanner;
// take value from user only in default constructor ???
public class Area {
	
	void area(int a)
	{
		int sq =a*a;
		System.out.println("Area of square is:- "+sq);
	}
	void area(int l,int b)
	{
		int rec = l*b;
		System.out.println("Area of rectangle is:- "+rec);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Area a = new Area();
		a.area(4);
		a.area(3, 4);
	
	}

}
