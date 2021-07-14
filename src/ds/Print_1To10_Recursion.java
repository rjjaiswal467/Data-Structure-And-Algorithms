package ds;

public class Print_1To10_Recursion {

    public static int printSum1(int n){
        if (n==0){
            return 0;
        }
        return n+printSum1(n-1);
    }

    public static int printSuccessiveSum(int n){ //1 3 6 10 15 21 28 36 45 55
        int m=0;
        if (n>0){
            m = n + printSuccessiveSum(n-1);
            System.out.print(" " +m);
        }
        return m;
    }

    public static void printNo(int n){
        if (n>0){
            printNo(n-1);
            System.out.print(" " +n);
        }
    }

    public static void main(String[] args) {

        int tmp = Print_1To10_Recursion.printSum1(10);
        System.out.println("Sum is " +tmp);

        Print_1To10_Recursion.printNo(10);
        System.out.println();
        Print_1To10_Recursion.printSuccessiveSum(10);
    }
}
