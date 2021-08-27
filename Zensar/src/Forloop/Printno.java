package Forloop;

public class Printno 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=30;i++)
		{
			if(i%2==0 || i%3==0)
			{
				System.out.println(i);
			}else
			{
				System.out.println("*");
			}
		}*/
		
		int sum=0;
		for(int i=2;i<=10;i=i+2)
		{
			 sum=sum+i;
			 
		}
		int avg=sum/10;
		
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
