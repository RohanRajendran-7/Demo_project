package datastructures;


class queues{
	private int[] items;
	private int rear;
	private int front;
	private int count;
	
	public void ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	public void enqueue(int num) {
		if(count == items.length)
			throw new IllegalStateException();
		items[rear++] = num;
		count++;
	}
	public void dequeue() {
		var item = items[front];
		items[front++] = 0;
		
	}
}

public class arrayQueue {
	public static void main(String[] args) {
		
	}
}
