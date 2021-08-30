package Unchecked_Exception;

public class Null_pointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1=null;
		String str2="kiran";
		try {
			if(str1.equals(str2))
			{
				System.out.println("Strings are equal");
			}else
			{
				System.out.println("Strinngs are not equal");
			}
		}catch(NullPointerException n)
		{
			System.out.println("String is null");
			n.printStackTrace();
		}
	}

}
