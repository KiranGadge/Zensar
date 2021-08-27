package Interface;

public class Strawberry implements Cake{

	@Override
	public void bake()
	{

		System.out.println("Strawberry cake is baking");
		
	}

	@Override
	public void ordered() 
	{
		System.out.println("Strawberry cake is ordered");
		
	}

}
