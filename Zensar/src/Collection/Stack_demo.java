package Collection;

import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s= new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("Stack:- "+s);
		s.pop();
		System.out.println("After pop stack:- "+s);
		s.peek();
		System.out.println("After peek stack:- "+s);
	}

}
