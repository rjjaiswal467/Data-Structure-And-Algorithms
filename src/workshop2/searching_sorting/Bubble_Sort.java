package workshop2.searching_sorting;

public class Bubble_Sort {

     static void bubbleSort(int arr[]){

         for (int i = 0; i < arr.length - 1; i++) {
             boolean swap=false;
             for (int j=0;j< arr.length-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     arr[j] = arr[j]+arr[j+1];
                     arr[j+1] = arr[j]-arr[j+1];
                     arr[j] = arr[j] -arr[j+1];
                     swap = true;
                 }
             }
             if (!swap){
                break;
             }
         }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }


    public static void main(String args[])
    {
        long starttime = System.nanoTime();
        int arr[] = {1,2,6,7,4}; //0459993
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr);

        long endtime = System.nanoTime();
        long totaltime = endtime-starttime;
        System.out.println(totaltime/Math.pow(10,9));
    }
}
// worst & Avg - O(n*n)
// best - O(1)