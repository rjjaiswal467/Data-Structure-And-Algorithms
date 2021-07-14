package workshop1.array;

import java.util.Scanner;

public class Reversing_Array {
    //Method - 1
    static void Reversing_Array1(int[] arr,int N){
        int temp1=N-1;
        for (int i = 0; i < N/2; i++) {
            int temp = arr[i];
            arr[i]=arr[temp1];
            arr[temp1]=temp;
            temp1--;
        }
    }
    // Method - 2
    static void Reversing_Array2(int[] arr, int N){
        int start=0;
        int end = N-1;
        while(start<end){
            int tmp = arr[start];
            arr[start]= arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element of an array");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
//        Reversing_Array1(arr,size);
        Reversing_Array2(arr,size);
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]);
        }
    }
}
