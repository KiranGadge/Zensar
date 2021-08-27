package Oops;

public class Car extends Abstract {
	
	
	void car()
	{
		System.out.println("Car class extends abstracted class *Abstract*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.car();
		c.drive();
		c.wash();

	}

}
