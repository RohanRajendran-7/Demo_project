package datastructures;

import java.util.Arrays;
import java.util.Scanner;

//import com.sun.tools.javac.util.ArrayUtils;


class Array {
	private Scanner scan = new Scanner(System.in);
	private int[] items;
	private int count;

	public Array(int length) {
		items = new int[length];
	}

	public void insert(int item) {
		items[count++] = item;
	}
	
	public void insertAt(int num, int index) {
		items[index - 1] = num;
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
	
	public int max() {
		int num =Integer.MIN_VALUE ;
		for (int i : items) {
			if(i > num)
				num = i;
		}
		return num;
	}
	public void intersect() {
		int num, var,z=0;
		System.out.println("Enter the length of the comparing array");
		num = scan.nextInt();
		int[] temp = new int[num];
		int[] samp = new int[num];
		System.out.println("enter the comparing array elements");
		for (int i = 0; i < num-1; i++) {
			var = scan.nextInt();
			temp[i]= var;
		}
		for (int i : temp) {
			for (int j : items)
				if( i == j) {
					samp[z] = i;
					z++;
				}
		}
		System.out.println("the matching elements are" + Arrays.toString(samp));
		
		
	}

	public String reverse() {
		
		int[] temp = new int[5];
		int j =0;
		for(int i = items.length-1; i >= 0 ; i--) {
			temp[j] = items[i];
			j++;
		}

		return (Arrays.toString(temp));
		
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

public class sample {
	public static void main(String[] args) {
		Array numbers = new Array(5);
		numbers.insert(100);
		numbers.insert(200);
		numbers.insert(300);
		numbers.insert(400);
		numbers.insert(500);
		numbers.print();
		System.out.println("Maximum Element" + numbers.max());
//		System.out.println("Index of Element : " + numbers.indexOf(1200));
		numbers.intersect();
//		numbers.print();
		System.out.println(numbers.reverse());
	}
	
}
