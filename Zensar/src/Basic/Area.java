package Basic;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious of circle:- ");
		int r = sc.nextInt();
		final double PI =3.14;
		double area;
		
		area = PI * r * r;
		System.out.println("Area of circle is:- "+area);
		
		sc.close();
	}
	

}
