package Collection;

import java.util.ArrayList;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<>();
		a.add("Blue");
		a.add("Red");
		a.add("Green");
		a.add("Yello");
		a.add("Violet");
	
		a.forEach(c->System.out.println("Color:- "+c));
	}

}
