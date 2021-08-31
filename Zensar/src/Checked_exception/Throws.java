package Checked_exception;

public class Throws {
	static void fun() throws IllegalAccessException
	{
		System.out.println("Throws IllegalAccess Exception");
		throw new IllegalAccessException();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		System.out.println("Hello world");

		try {
			fun();
		}catch(IllegalAccessException ill)
		{
			ill.printStackTrace();
			System.out.println("Exception");
		}
	}

}
