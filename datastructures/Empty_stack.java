package datastructures;

import java.util.Stack;

public class Empty_stack {
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>();
	stack.push(200);
	stack.push(200);
	stack.push(200);
	System.out.println(stack);
	var top = stack.peek(); //returns top element
	System.out.println("stack is empty?" + stack.isEmpty());
	
}
}
