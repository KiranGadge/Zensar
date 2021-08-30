package Unchecked_Exception;

public class Class_cast_Exception {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_cast_Exception cce = new Class_cast_Exception();
		try {
		Object obj = Integer.valueOf(50);
		String str = (String)obj;
		System.out.println(str);
		}catch(ClassCastException c)
		{
			c.printStackTrace();
		}
	}

}
