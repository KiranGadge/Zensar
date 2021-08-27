package Oops;

public class Calculator {
	
	int a,b;
	
	public Calculator(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void add()
	{
		System.out.println("in add");
	}
	
	public int multiply()
	{
		return a*b;
	}
	
	public float division()
	{
		return a/b;
	}
	static int fact(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
		fact=fact*i;
		}
		System.out.println("factorial:- "+fact);
		return fact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator(5,5);
		cal.add();
		System.out.println("Multiplication is:- "+cal.multiply());
		System.out.println("Division is:- "+cal.division());
		Calculator.fact(5);
	}

}
