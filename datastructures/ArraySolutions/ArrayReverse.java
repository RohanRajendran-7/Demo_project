package datastructures.ArraySolutions;

import java.util.Arrays;

public class ArrayReverse {
	public static String reverse(int[] items) {
		
		int[] temp = new int[5];
		int j =0;
		for(int i = items.length-1; i >= 0 ; i--) {
			temp[j] = items[i];
			j++;
		}

		return (Arrays.toString(temp));
		
	}
}


