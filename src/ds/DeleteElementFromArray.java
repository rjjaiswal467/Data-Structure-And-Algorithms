package ds;

import java.util.Scanner;

public class DeleteElementFromArray {

	private static void deleteElement(int key, int[] array) {

		for (int i = 0; i < array.length; i++) {
			int j = array.length - i - 1;
			if (key == array[i]) {
				int tmp=i;
				while (j > 0) {
					array[tmp] = array[tmp + 1];
					System.out.println(i+ " and " +j);
					tmp++;
					j = j - 1;
				}
				break;
			}
		
		}

	}

	public static void main(String[] args) {

		int array[] = { 100, 200, 300, 400, 500, 600, 700,800};
		Scanner s = new Scanner(System.in);
		System.out.println("enter element to del");
		int key = s.nextInt();
		DeleteElementFromArray.deleteElement(key, array);
		for (int i = 0; i < array.length-1; i++) {
			System.out.println(array[i]);
		}
	}

}
