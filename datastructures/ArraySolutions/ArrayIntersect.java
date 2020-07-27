package datastructures.ArraySolutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersect {
	private static Scanner scan = new Scanner(System.in);
	public static void intersect(int[] items) {
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
		System.out.println("the matching elements are" + Arrays.toString(Arrays.copyOfRange(samp, 0, z)));
		
		
	}
}
