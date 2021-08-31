package Unchecked_Exception;

public class Child extends Parent{

		void division(int a,int b)
		{
			int div=a/b;
			System.out.println("Division is:- "+div);
		}
	
		void display(String str)
		{
			try {
				if(str.equals("kiran"))
				{
					System.out.println("strings same");
				}else
				{
					System.out.println("Not same strings");
				}
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			
		}
		
public static void main(String[] args) {
			
	try
	{
	Parent p = new Child();
	p.division(10,5);
	p.display("kiran");
	//p.division(10, 0);
	p.display(null);
	}catch(ArithmeticException ar)
	{
		System.out.println("Divisor should not be 0");
		ar.printStackTrace();
	}

}
}