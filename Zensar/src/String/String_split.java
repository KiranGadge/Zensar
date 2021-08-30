package String;

import java.util.Arrays;
import java.util.Scanner;

public class String_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter string/sentense:- ");
		String str = sc.nextLine();
		
		String []arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
	}

}
