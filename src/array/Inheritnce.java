package array;

public class Inheritnce implements I1,I2 {

    @Override
    public void m() {
        I1.super.m();
        System.out.println("in test1");
    }
    public static void main(String[] args) {

        I1 test1 = new Inheritnce();
        I2 test2 = new Inheritnce();
        Inheritnce test3 = new Inheritnce();
        test1.m();
        test2.m();
        test3.m();
    }
}
// Now both I1 and I2 method are default and we can call either
//method using super keyword.