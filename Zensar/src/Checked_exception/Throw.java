package Checked_exception;

public class Throw {
	public static void validate(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("Arithmetic exception");
		}else
		{
			System.out.println("Person can vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic exception throw");
		validate(13);
		

	}

}
