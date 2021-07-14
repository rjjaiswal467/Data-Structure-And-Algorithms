package ds;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		
		System.out.println("Enter the elements of the array");
		int[] array = new int[len];
		
		for(int i=0;i<len;i++) {
			array[i] = s.nextInt();
		}
		
		System.out.println("Sorted Array is below:- ");
		
		// Selection sort algo
		
		for (int i = 0; i < len-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < len; j++) 
                if (array[j] < array[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        }
    
		
		for(int i=0; i<len; i++) {
			System.out.println(array[i] + " ");
		}
		
	}
	
}
