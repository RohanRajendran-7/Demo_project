package datastructures;

import java.util.NoSuchElementException;

class Node{
	int value;
	Node next;
	
	public Node(int value) {
		this.value= value;
	}
}
class LinkedList{
	private Node first;
	private Node last;	
	
	public void addLast(int item) {
		Node node = new Node(item);
		if(first==null) {
			first=last=node;
		}else {
			last.next = node;
			last = node;
			
		}
	}
	public void addFirst(int item) {
		Node node = new Node(item);
		if(first==null) {
			first=last=node;
		}else {
			first.next = node;
			first = node;
			
		}
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while (current != null) {
			if (current.value == item)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}
	public void removeFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if (first == last) {
			first = last = null;
		}
		var second = first.next;
		first.next = null;
		first = second;
		
	}
}
public class linkedListExcercise {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.addLast(100);
	}

}
 