package datastructures.ArraySolutions;

import java.util.Arrays;
import java.util.Scanner;

//import com.sun.tools.javac.util.ArrayUtils;


class Array {
	private Scanner scan = new Scanner(System.in);
	public int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
	}

	public void insert(int item) {
		items[count++] = item;
	}
	


	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count - 1)
			throw new IllegalArgumentException();
		for (int i = index; i < count - 1; i++) {
			items[i] = items[i + 1];
		}
		count--;
	}

	public int indexOf(int item) {
		for (int i = 0; i < count; i++) {
			if (items[i] == item)
				return i;
		}
		return -1;
	}
	
}



//public class ArrayDemo {
//
//	public static void main(String[] args) {
//
//		
//		/**
//		 * int[] numbers = new int[3]; System.out.println(numbers); // [I@762efe5d
//		 * System.out.println(Arrays.toString(numbers)); // [0, 0, 0] numbers[0] = 10;
//		 * numbers[1] = 20; numbers[2] = 30;
//		 * System.out.println(Arrays.toString(numbers)); // [10, 20, 30]
//		 * System.out.println(numbers.length); // 3
//		 */
//
//	}
//
//}

public class mainMethod {
	public static void main(String[] args) {
		Array numbers = new Array(5);
		numbers.insert(100);
		numbers.insert(200);
		numbers.insert(300);
		numbers.insert(400);
		numbers.insert(500);
		numbers.print();
		System.out.println("Maximum Element" + ArrayMax.max(numbers.items));
//		System.out.println("Index of Element : " + numbers.indexOf(1200));
//		ArrayIntersect.intersect(numbers.items);
//		numbers.print();
		System.out.println(ArrayReverse.reverse(numbers.items));
	}
	
}
