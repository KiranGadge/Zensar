package Test;

public class FreqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int [] {1,2,3,4,1,3,1,0};
		int[] arr2 = new int [arr.length];
		int visit =-1;
		
		for(int i=0;i<arr.length;i++)
		{
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					arr2[j]=visit;
				}
			}
			if(arr2[i]!=visit)
				arr2[i]=c;
		
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]!=visit)
			{
				System.out.println(arr[i]+"-->"+arr2[i]);
			}
		}
	}

}
