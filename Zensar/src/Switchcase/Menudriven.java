package Switchcase;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		do{
		System.out.println("Which operation do you want to perform??\n 1.Area of circle 2.Area of square 3.Area of a right angled triangle\n"
				+ "4.Area of rectangle 5.Circumference of circle 6.Perimeter of square ");
		int ch=sc.nextInt();
		final double PI =3.14;
		
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter the radius of circle:- ");
					int r = sc.nextInt();
					double areaC;
					areaC = PI * r * r;
					System.out.println("Area of circle is:- "+areaC);
					break;
				case 2:
					System.out.println("Enter the side of square:- ");
					int side = sc.nextInt();
					int areaS = side * side;
					System.out.println("Area of square is:- "+areaS);
					break;
				case 3:
					System.out.println("Enter the value of base and height:- ");
					int b = sc.nextInt();
					int h = sc.nextInt();
					int areaRR = 1/2*b*h;
					System.out.println("Area of right angled triangle is:- "+areaRR);
					break;
				case 4:
					System.out.println("Enter length and width of rectangle:- ");
					int l = sc.nextInt();
					int w= sc.nextInt();
					int areaR = l*w;
					System.out.println("Area of right angled triangle is:- "+areaR);
					break;
				case 5:
					System.out.println("Enter radius of circle:- ");
					int rr = sc.nextInt();
					double Circ = 2*PI*rr;
					System.out.println("Circumference of circle:- "+Circ);
					break;
				case 6:
					System.out.println("Enter the side of square:- ");
					int s = sc.nextInt();
					int periS = 4 * s;
					System.out.println("Perimeter of square is:- "+periS);
					break;
				default:
					System.out.println("Thank you!!");
					
			}
			System.out.println("do you want to continue??(y/n)");
			char ans = sc.next().charAt(0);
			if(ans=='n' || ans=='N')
				break;
		}while(true);	
		
	
	}

}
