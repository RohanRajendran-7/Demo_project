package datastructures;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class queue {

	
// Reverse a queue using stack operations
	public static void reverse(Queue<Integer> queue) { // queue object is passed thus accessible in the main method
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty())
			stack.push(queue.remove());
		while(!stack.isEmpty())
			queue.add(stack.pop());
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(100);
		queue.add(200);
		queue.add(300);
		reverse(queue);
		System.out.println(queue);
	}

}
