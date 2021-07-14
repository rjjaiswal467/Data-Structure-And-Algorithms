package workshop1.array;

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Array2 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        while(t-->0){

            //input size of array
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            //inserting elements in the array
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Leaders_Array obj = new Leaders_Array();

            StringBuffer str = new StringBuffer();
            ArrayList<Integer> res = new ArrayList<Integer>();

            //calling leaders() function
            res = obj.leaders(arr, n);

            //appending result to a String
            for(int i=0; i<res.size(); i++){
                str.append(res.get(i)+" ");
            }

            //printing the String
            System.out.println(str);
        }

    }
}
// } Driver Code Ends



class Leaders_Array{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list.add(arr[n-1]);
        int tmp= arr[n-1];
        while(n>=2){

            if (arr[n-2]>=tmp) {
                tmp = arr[n-2];
                list.add(tmp);
            }
            n--;
        }
        int k=list.size()-1;
        for (int i = 0; i < list.size(); i++) { //reversing arraylist
            list1.add(list.get(k));
            k--;
        }
        list.clear();//clear arraylist
             return list1;
    }
}
