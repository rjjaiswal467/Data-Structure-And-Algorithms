package workshop1.mathematics;

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
class Main1 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);



        //taking testcases
        int T=sc.nextInt();

        while(T-->0)
        {
            Solution2 obj=new Solution2();
            int N;
            N=sc.nextInt();//taking N
            //calling function exactly3Divisors()
            System.out.println(obj.exactly3Divisors(N));


        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Solution2
{

    public int exactly3Divisors(int N)
    {
        int tmp = (int) Math.sqrt(N);
        int flag;
        int primecounter=0;
        for (int i=2;i<=tmp;i++){

            flag=1;

            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    flag = 0;
                    break;
                }
            }
            if (flag==1){
                primecounter++;
            }
        }

        return primecounter;
    }
}

