package Basic;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:- ");
		int num = sc.nextInt();
		
		int notes = num/2000;
		num = num%2000;
		int notes1 = num/500;
		num = num%500;
		int notes2 = num/50;
		num = num%50;
		int notes3 = num/10;
		num = num%10;
		int notes4 = num/1;
		System.out.println("2000 notes:- "+notes+" "+"500 notes:- "+notes1+"\n"+"50 notes:- "+notes2+" "+"10 notes:- "+notes3+" "+"1 notes:- "+notes4);
		sc.close();
	}

}
