package datastructures.StackSolutions;



import java.util.Arrays;

// printing obj in stack using array prints the address unlike STACK

class Stacks1{
	private static int count;
	private int[] items = new int[5];
	public void push(int item) {
		if (count == items.length)
			throw new StackOverflowError();
		items[count++] = item;
		System.out.println(count);
	}

	@Override
	public String toString() {
		var content = Arrays.copyOfRange(items,0,count); //used to return the non zero elements in the array
		return Arrays.toString(content);
	}
	public int minimum() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < count; i++) {
			if(min > items[i])
				min =items[i];
		}
		return min;
	}
	
	
	public int peek() {
		if(count == 0)
			throw new IllegalStateException();
		return items[count-1];
	}
	public int pop() {
		if(count==0) {
			throw new IllegalStateException();
		}
		return items[--count];
	}
//	public boolean isEmpty() {
//		if(count == 0) {
//			return false;
//		}
//		return true;
//	}
	
}



public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks1 stack =new Stacks1();
		stack.push(400);
		stack.push(200);
		stack.push(300);
		stack.push(100);
		System.out.println(stack.minimum());
		stack.pop();
		System.out.println(stack);
		System.out.println();
		System.out.println(stack.minimum());
	}

}
