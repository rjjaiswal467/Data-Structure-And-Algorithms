package ds;

import java.util.Scanner;

public class LinearSearch {

	public static int searching(int search, int array[]) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of the array");
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();

		System.out.println("Enter the elements of the array");
		int[] array = new int[len];

		for (int i = 0; i < len; i++) {
			array[i] = s.nextInt();
		}

		System.out.println("Enter the number for searching");

		int search = s.nextInt();
		int res = searching(search, array);

		if (res == -1) {
			System.out.println("not found");

		} else
			System.out.println(" Found at " + res);

	}

}
