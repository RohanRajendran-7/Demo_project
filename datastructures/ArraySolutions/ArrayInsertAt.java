package datastructures.ArraySolutions;

public class ArrayInsertAt {
	public static void insertAt(int num, int index,int[] items) {
		items[index - 1] = num;
	}

}
