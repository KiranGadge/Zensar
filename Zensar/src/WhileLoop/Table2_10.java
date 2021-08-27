package WhileLoop;

public class Table2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		while(i<=10)
		{
			int a=1;
			int sum=i;
			while(a<=10)
			{
				sum=i*a;
				System.out.print(sum+" ");
				a++;
			}
			System.out.println("");
			i++;
		}

	}

}
