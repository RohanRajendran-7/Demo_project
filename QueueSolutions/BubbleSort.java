package QueueSolutions;

import java.util.Arrays;
import java.util.Scanner;

class Elements{
	private Scanner scan = new Scanner(System.in);
	private int[] val;
	Elements(int num){
		val = new int[num];
		for (int i = 0; i < val.length; i++) {
			val[i] = scan.nextInt();
		}
	}
	
	@Override
	public String toString() {
		return "Elements [val=" + Arrays.toString(val) + "]";
	}

	public void bubble() {
		queues q = new queues(1);
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val.length - i -1 ; j++) {
				if(val[j] > val[j+1])
					q.swap(j,j+1,val);
			}
		}
		System.out.println(Arrays.toString(val));
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements elements= new Elements(5);
		elements.bubble();

	}

}
