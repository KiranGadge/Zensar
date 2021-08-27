package Patterns;

public class Sq_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//square--	
		//int row=5,col=5;
		/*
		 * * * * * 
		 * * * * * 
		 * * * * *
	     * * * * * 
		 * * * * *
		 
		 for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
	//******************************************
		//rectangle--
		/* 
		* * * * * 
		* * * * * 
		* * * * *
		for(int n=1;n<=3;n++)
		{
			for(int m=1;m<=5;m++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
	//*************************************
		//left triangle--
		
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.println();
				
		}*/
		
	
		//*************************************
			//hollow square--
		/*
		   *******
		   *   *
		   *   *
		   *   *
		   *   *
		   *   *
		   *******
		 */
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==1 ||i==7 ||j==1 ||j==7)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}System.out.println();
			
		}
//***********************************************
		//square with diagonals
		/*
		 	**********
		 	**      **
		 	* *    * *
		 	*  *  *  *
		 	*   **   *
		 	*   **   *
		 	*  *  *  *
		 	* *    * *
		 	**      **
		 	**********
		 */
		/*for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i==1 ||i==10 ||j==1 ||j==10 || i==j || j==(10-i+1) )
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}System.out.println();
			
		}*/
	}

}
