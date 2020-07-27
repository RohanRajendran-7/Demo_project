package QueueSolutions;

import java.util.Arrays;

	class queues{
	public int[] items;
	private int rear;
	private int front;
	private int count;
	@Override
	public String toString() {
		var content = Arrays.copyOfRange(items, 0, items.length);
		return "queues [items=" + Arrays.toString(content) + "]";
	}
	
	public queues(int capacity) {
		items = new int[capacity];
	}
	public void enqueue(int num) {
		if(count == items.length)
			throw new IllegalStateException();
		items[rear++] = num;
		count++;
	}
	public int dequeue() {
		var item = items[front];
		items[front++] = 0;
		count--;
		return item;
		
	}

	public static void swap(int num, int last, int[] z) {
		int temp = z[num];
        z[num] = z[last]; 
        z[last] = temp; 
	}
}

public class arrayQueue {
	public static void main(String[] args) {
		queues queue = new queues(5);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);
//		System.out.println("deque o/p : " + queue.dequeue());
//		System.out.println("deque o/p : " + queue.dequeue());
		System.out.println(queue);
		QueueReverser.QueueReverse(4,queue.items );
	}
}
