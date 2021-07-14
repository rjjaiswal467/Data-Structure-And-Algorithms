package workshop1.array;
//Smallest_Positive_Missing_Number
// { Driver Code Starts
import java.util.*;

class Main_Smallest_positive_Missing
{

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int missing = new Smallest_Positive_Missing_Number().findMissing(arr,n);

            System.out.println(missing);
        }
    }
}// } Driver Code Ends




class Smallest_Positive_Missing_Number{

    // Function to find
    static int findMissing(int arr[], int size)
    {
      boolean[] tmp = new boolean[size+1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 && arr[i]<=size){
                tmp[arr[i]]=true;
            }
            }

        for (int i = 1; i <= size; i++) {
            if(tmp[i]==false){
                return i;
            }
        }
        return size+1;
        }
    }
