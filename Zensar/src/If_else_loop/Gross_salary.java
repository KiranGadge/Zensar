package If_else_loop;

import java.util.Scanner;

public class Gross_salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter basic salary:- ");
		double salary = sc.nextDouble();
		double hra,da,gross;
		
		if(salary <=10000)
		{
			hra = salary *0.20;
			da = salary *0.8;
			gross = salary + hra + da;
			System.out.println("Gross salary is :- "+gross);
		}else if(salary<=20000)
		{
			hra = salary *0.25;
			da = salary *0.9;
			gross = salary + hra + da;
			System.out.println("Gross salary is :- "+gross);
		}else if(salary>20000)
		{
			hra = salary *0.30;
			da = salary *0.95;
			gross = salary + hra + da;
			System.out.println("Gross salary is :- "+gross);
		}
		sc.close();
	}

}
