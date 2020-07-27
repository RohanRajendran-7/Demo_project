package datastructures.LinkedListSolutions;

public class HasLoop {
	public static byte LinkedListHasLoop(Node first){
		Node slow;
		Node fast;
		boolean flag = false;
		slow = fast = first;		
		while((fast != null) && (fast.next!=null) ){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) { 
				flag = true; 
				break; 
			} 
			if(!flag) 
				return 0; 
		}
		return 0;
	}

}
