package datastructures.ArraySolutions;

public class ArrayMax {
	public static int max(int[] items) {
		int num =Integer.MIN_VALUE ;
		for (int i : items) {
			if(i > num)
				num = i;
		}
		return num;
	}

}
