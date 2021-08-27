package Basic;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values to perform the operations:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Which operation do you want to perform:- 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulous");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addition is:- " +(a+b));
			break;
		case 2:
			System.out.println("Subtraction is:- " +(a-b));
			break;
		case 3:
			System.out.println("Multiplication is:- " +(a*b));
			break;
		case 4:
			if(b==0)
			{
				System.out.println("Divisor can not be Zero");
			}
			System.out.println("Division is:- " +(a/b));
			break;
		case 5:
			System.out.println("Modulous is:- " +(a%b));
			break;
		default:
			System.out.println("Thank you!!");
		}
		sc.close();
		
	}

}
