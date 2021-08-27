package Oops;

public class Cycle {
	int accno;
	int noOfWheels;
	//how to use this with methods
	
	Cycle()
	{
		System.out.println("Im in default constructor");
	}
	Cycle(int accno,int noOfWheels)
	{
		this();
		System.out.println("Im another constructor");
	}
	void ride()
	{
		System.out.println("Riding");
		wash(this);
	}
	private void wash(Cycle cycle) {
		System.out.println("Method using this");
		
	}
	void wash(int time)
	{
		System.out.println("Washing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle c = new Cycle();
		Cycle c2 = new Cycle(100,4);
		c.ride();
		c.wash(4);

	}

}
