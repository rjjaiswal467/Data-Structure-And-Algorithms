package ds;

public class Prime_Number {

    public static void print_primes_till_N(int N)
    {
        // Declare the variables
        int i, j, flag;

        // Print display message
        System.out.println("Prime numbers between 1 and "
                + N + " are:");

        for (i = 2; i <= N; i++)
        {

            flag = 1;

            for (j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int N = 1000;

        print_primes_till_N(N);
    }
}
