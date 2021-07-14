package workshop2.searching_sorting.Pending;
//Search_An_Element_In_Sorted_And_Rotated_Array
// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG_Search_An_Element_In_Sorted_And_Rotated_Array{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0; i<n; i++)
            {
                array[i] = sc.nextInt();
            }
            int target = sc.nextInt();

            Search_An_Element_In_Sorted_And_Rotated_Array ob = new Search_An_Element_In_Sorted_And_Rotated_Array();
            System.out.println(ob.Search(array,target));
            t--;
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Search_An_Element_In_Sorted_And_Rotated_Array
{
    static int Search(int array[], int target)
    {

        return 0;
    }
}
