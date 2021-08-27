package WhileLoop;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;

		while(i<=50)
		{
			if(i%i==0 && i%1==0)
			{
				System.out.println(i);
			}else
			{
				System.out.println("*");
			}
		}
	}

}
