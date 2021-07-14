package workshop3.string;

// { Driver Code Starts
import java.lang.*;
import java.io.*;

class Anagram {

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            Solution_Anagram obj = new Solution_Anagram();

            if(obj.isAnagram(s1,s2))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}// } Driver Code Ends

class Solution_Anagram
{
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {

        int[] array = new int[256];
        int length1 = a.length();
        int length2 = b.length();
        if (length1 != length2){
            return false;
        }
        while(length1>0){
            array[a.charAt(length1-1)]++;
            array[b.charAt(length2-1)]--;
            length1--;
            length2--;
        }
        for (int i = 0; i <256 ; i++) {
            if(array[i]!=0)
                return false;
        }
        return true;
    }
}
