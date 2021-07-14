package workshop2.searching_sorting.Pending;
//Square_Root_Of_A_Number
// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            long a = sc.nextInt();
            Square_Root_Of_A_Number obj = new Square_Root_Of_A_Number();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Square_Root_Of_A_Number
{
    long floorSqrt(long x)
    {
        return 1;
    }
}
