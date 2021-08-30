package Unchecked_Exception;

public class Arithmatic_exceptions {

	public void divide(int a,int b)
	{
	try {
		int div = a/b;
		System.out.println("Division is:- "+div);
		}catch(ArithmeticException ar)
		{
				System.out.println("Demoninator should not be 0");
				ar.printStackTrace();
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmatic_exceptions re = new Arithmatic_exceptions();
		re.divide(10,5);
		System.out.println("***********************");
		re.divide(5, 0);
		
		
		
		
	}

}
