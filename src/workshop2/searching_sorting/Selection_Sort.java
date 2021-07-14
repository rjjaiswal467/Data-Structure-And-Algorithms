package workshop2.searching_sorting;

public class Selection_Sort {

    static void swap (int arr[],int tmp,int j){
        arr[tmp] = arr[tmp]+arr[j];
        arr[j] = arr[tmp]-arr[j];
        arr[tmp] = arr[tmp]-arr[j];
    }
    static void selectionsort(int arr[]){

        for (int i = 0; i < arr.length - 1; i++) {
            int tmp =i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[tmp]>arr[j]) {
                    swap(arr,tmp,j);
                }
            }
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,7,1,9,43,46,53,0,1}; //0459993
        selectionsort(arr);
        System.out.println("Sorted array");
        printArray(arr);

    }
}
