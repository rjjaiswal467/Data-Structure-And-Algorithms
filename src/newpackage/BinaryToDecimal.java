package newpackage;

public class BinaryToDecimal {
    static int conversion(String s){
        int sum=0;
        for (int i=0; i<s.length();i++){

            if(s.charAt(i)=='1'){
                sum = sum + (int) Math.pow(2,i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String s = "10111";
        int sum = 2^3;
        System.out.println(sum);
        System.out.println(BinaryToDecimal.conversion(s));
    }
}
