package workshop3.string;

import java.util.Scanner;

class ADD_Two_Strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution_ADD_Two_Strings g=new Solution_ADD_Two_Strings();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution_ADD_Two_Strings
{
    public String multiplyStrings(String s1,String s2)
    {
        StringBuffer sb = new StringBuffer();

        int tenth = 0;
        int i=s1.length();
        int j=s2.length();

        while(i>0 || j>0){
            int once=0;
            if(i>0){
                once = s1.charAt(i-1)- '0';
                i--;
            }
            if(j>0){
                once = once + s2.charAt(j-1) - '0';
                j--;
            }
            once+=tenth;
            tenth=once/10;
            sb.append(once%10);
        }
        sb.append(tenth);

        return sb.reverse().toString();
    }
}
