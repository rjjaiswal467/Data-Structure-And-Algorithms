package workshop1.array;

// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG_transition obj = new GfG_transition();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG_transition {
    int transitionPoint(int arr[], int n) {
        int i=0;
        if(arr[n-1]==0){
            return -1;
        }
        while(i<n){
            if(arr[i]==1){
                break;
            }
            else {
                i++;
            }
        }
        return i;
    }
}
