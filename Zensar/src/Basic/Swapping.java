package Basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos to swap:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		/*System.out.println("Swapping using third variable:- ");
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a +" "+ b);*/
		System.out.println("Swapping wihtout using third variable:- ");
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a +" "+ b);
		sc.close();
	}

}
