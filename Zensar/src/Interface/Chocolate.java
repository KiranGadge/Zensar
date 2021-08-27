package Interface;

public class Chocolate implements Cake {


	@Override
	public void bake()
	{
		System.out.println("Chocolate cake is baking");
		
	}

	@Override
	public void ordered() 
	{
		System.out.println("Chocolate cake is ordered");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cake c = new Chocolate();
		c.bake();
		c.ordered();
		System.out.println("************************************");
		Cake s = new Strawberry();
		s.bake();
		s.ordered();
		
	}
}
