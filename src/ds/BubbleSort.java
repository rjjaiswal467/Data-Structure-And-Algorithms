package ds;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[] array = new int[len];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0; i<len; i++) {
			array[i] = s.nextInt();
		}
		
		System.out.println("Sorted elements are below :- ");
		
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-i-1; j++) {
//				System.out.println("i="+i+ "j="+j);
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		for(int i=0; i<len; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
