package workshop3.string;

import java.lang.*;
import java.io.*;
import java.util.*;
class Max_Occuring_Char
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine().trim());

        while(tc-- >0)
        {
            String line=br.readLine().trim();

            Solution_Max_Occuring_Char obj = new Solution_Max_Occuring_Char();

            System.out.println(obj.getMaxOccuringChar(line));

        }
    }
}// } Driver Code Ends

class Solution_Max_Occuring_Char
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        final int ASCII_SIZE = 256;
        int[] array = new int[ASCII_SIZE];
        for (int i = 0; i < line.length(); i++)
        {
            array[line.charAt(i)]++;
        }
            int max = 0;
            char result = ' ';
        for (int i = 0; i < line.length(); i++)
        {
                if(max < array[line.charAt(i)]){
                    max=array[line.charAt(i)];
                    result = line.charAt(i);
                }
                else if (max == array[line.charAt(i)]){
                      Math.min((int) result,(int)line.charAt(i));
                      result = (char) Math.min((int) result,(int)line.charAt(i));
                }
        }
        return result;
    }

}

