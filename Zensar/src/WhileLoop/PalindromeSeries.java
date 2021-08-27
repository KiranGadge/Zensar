package WhileLoop;

public class PalindromeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=100;n<200;n++)
		{
			int temp=n;
			int sum=0;
		
		while(temp>0)
		{
			int r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+" is a palindrome");
		else
			System.out.println(n+" is not palindrome");
	}
	}

}
