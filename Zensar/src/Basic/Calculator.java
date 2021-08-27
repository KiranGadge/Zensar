package Basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five subjects:-");
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		int math = sc.nextInt();
		int bio = sc.nextInt();
		int IT = sc.nextInt();
		float percentage;
		final int marksoutof = 500;
		
		int total = phy+chem+math+bio+IT;
		System.out.println("Total is:- "+total);
		
		percentage = (total/marksoutof)*100;
		System.out.println("Percentage of marks is:- "+percentage+"%");
		sc.close();
	}

}
