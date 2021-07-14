package workshop2.searching_sorting;

public class Insertion_Sort {

    static void insertionsort(int arr[]){

        for (int i = 1; i < arr.length; i++) {
            int tmp = i-1;
//            int tmp+1 =i;

            while(tmp>=0 && arr[tmp+1]<arr[tmp]){
                arr[tmp+1] = arr[tmp+1]+arr[tmp];
                arr[tmp]= arr[tmp+1]-arr[tmp];
                arr[tmp+1]= arr[tmp+1]-arr[tmp];
                tmp--;
//                tmp+1--;
            }
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {11,2,1,40,5,6,7,8};
        insertionsort(arr);
        System.out.println("Sorted array");
        printArray(arr);

    }
}
//Worst - O(n*n)
//