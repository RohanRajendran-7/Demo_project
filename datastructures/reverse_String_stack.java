package datastructures;

import java.util.Stack;

class StringReverser{
	public String reverse(String input) {
		Stack<Character> stack = new Stack<>();
//		for (int i = 0; i < input.length(); i++) {
//			stack.push(input.charAt(i));
//		}
		for (char ch : input.toCharArray()) {
			stack.push(ch);
		}
		String reversed = "";
		while(!stack.isEmpty()) {
			reversed += stack.pop();
		}
		return reversed;
	}
}

public class reverse_String_stack {
	
	public static void main(String[] args) {
		StringReverser obj = new StringReverser();
		System.out.println(obj.reverse("abcde"));
	}
}
