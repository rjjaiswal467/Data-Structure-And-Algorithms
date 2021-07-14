package workshop1.mathematics;

public class Lcm_Two_Number {
    static int gcd (int a ,int b){
        if (a==0)
            return b;
        return gcd(b%a,a);
    }
    static int lcm (int a , int b){
        return (Math.abs(a*b)/gcd(a,b));
    }
    public static void main(String[] args) {

        System.out.println(lcm(126,4));
    }
}
