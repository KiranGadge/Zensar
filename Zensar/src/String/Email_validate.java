package String;

import java.util.Scanner;

public class Email_validate {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter email:- ");
			String email=sc.next();
			
			if(email.contains("@") && email.contains("."))
			{
				int i1=email.indexOf('@');
				int i2=email.indexOf('.');
					if(i1<i2)
					{
						System.out.println("Valid email");
					}
					else
					{
						System.out.println("Not email");
					}
				
			}
			else
			{
				System.out.println("Not valid email");
			}
		}
		

}
