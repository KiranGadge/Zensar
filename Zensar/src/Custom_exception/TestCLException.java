package Custom_exception;

import java.util.Scanner;

public class TestCLException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sid,sname and age of student:- ");
		int sid=sc.nextInt();
		String sname = sc.next();
		int age = sc.nextInt();
		
		
			if(age<18)
			{
				try {
					System.out.println("Custom exception");
					throw new StudentVoting_Exception("Student below 18 can not vote.");
			    	}catch (StudentVoting_Exception c)
					{
						c.printStackTrace();
					}
			}
			
			else
				System.out.println("Student can do voting");
	}

}
