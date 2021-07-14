package workshop1.array;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Element_Repeat {
    public static void main (String[] args) {

        //Taking input using class Scanner
        Scanner sc=new Scanner(System.in);

        //Taking total count of testcases
        int t=sc.nextInt();

        while(t-->0)
        {
            //taking total count of elements
            int n=sc.nextInt();

            //creating a new array of size n
            int arr[]=new int[n];

            //inserting elements to the array
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            First_Repeating_Element ob = new First_Repeating_Element();
            //calling firstRepeated method
            //and printing the result
            System.out.println(ob.firstRepeated(arr,n));
        }

    }
}// } Driver Code Ends


//User function Template for Java

class First_Repeating_Element{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int max;
        int val=-1;
        for (int i = 0; i < n; i++) {

            if (hashMap.containsKey(arr[i]) && hashMap.get(arr[i])>0){
                hashMap.put(arr[i],hashMap.get(arr[i])*-1); //if duplicate found make it negative
            } else if (hashMap.containsKey(arr[i])) { //if fount 3rd or greater times do nothing
                //do nothing
            } else { // if found first time store the index+1
                hashMap.put(arr[i], i + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (hashMap.get(arr[i])>0){ //remove all positive index because they occured only once.
                hashMap.remove(arr[i]);
            }
        }
        try {
            max = Math.abs(Collections.max(hashMap.values()));
        }
        catch (NoSuchElementException exception){ //handle exception if map is empty eg- no duplicates found.
            max = -1;
        }
        return max;
    }


    public static int firstRepeated_Method2(int []arr, int n)
    {
        Set<Integer> set = new HashSet<>();
        int r = -2;
        for( int i = n-1; i>=0 ;i--){
            if(set.contains(arr[i])){
                r = i;

            }else{
                set.add(arr[i]);
            }
        }
        return r+1;
    }
}
