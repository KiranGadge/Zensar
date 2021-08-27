package Basic;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of P,T,R for calculations:- ");
		float P ,T ,R;
		float interest;
		P = sc.nextFloat();
		T = sc.nextFloat();
	    R = sc.nextFloat();
	    
	    interest = (P*T*R)/100;
	    System.out.println("Simple interest is:- "+interest);
	    sc.close();
	}

}
