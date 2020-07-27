package QueueSolutions;

import java.util.Arrays;

public class QueueReverser {
	public static void QueueReverse(int num, int[] items) {
		int first=0;
		int last = num -1;
		while(first<last) {
			queues.swap(first,last,items);
			first ++;
			last -- ;
		}
		System.out.println(Arrays.toString(items));
		
	}
}
