package ds;

public class Find_Two_Missing_No {



    public static void main(String[] args)
    {
        int arr[] = {1,2, 3, 5, 6,8,9,10};
        int n = 2 +arr.length;

        findTwoMissingNumbers(arr, n);

    }

    private static void findTwoMissingNumbers(int[] arr, int n) {

        int tmp = 1;
        for (int i = 0; i < n-2; i++) {

            if(arr[i]!=tmp){
                System.out.println(tmp);
                i--;
            }
            tmp++;
        }
    }
}
