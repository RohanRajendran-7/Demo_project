package datastructures;

import java.util.Arrays;

// printing obj in stack using array prints the address unlike STACK

class Stacks{
	private int count;
	private int[] items = new int[5];
	public void push(int item) {
		if (count == items.length)
			throw new StackOverflowError();
		items[count++] = item;
	}

	@Override
	public String toString() {
		var content = Arrays.copyOfRange(items,0,count); //used to return the non zero elements in the array
		return Arrays.toString(content);
	}
	public int peek() {
		if(count == 0)
			throw new IllegalStateException();
		return items[count-1];
	}
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		return items[--count];
	}
	public boolean isEmpty() {
		if(count == 0)
			return false;
		return true;
	}
	
}



public class stack_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks stack =new Stacks();
		stack.push(100);
		stack.push(100);
	}

}
