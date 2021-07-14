package workshop3.string;

public class Example_1 {

    public static void main(String[] args) {
        String s1= new String("Raj Jaiswal");
        String s2= new String("Raj Jaiswal");
        System.out.println(s1==s2);//false

        String s3 = "Raj Jaiswal";
        System.out.println(s1==s3);//false

        String s4 = "Raj Jaiswal";
        System.out.println(s3==s4);//true

        String s5 = "Raj " + "Jaiswal";
        System.out.println(s4==s5);//true. Note- If both are constant then that operation is performed at compile time only

        String s6 = "Raj ";
        String s7 = s6+"Jaiswal";
        System.out.println(s4==s7);//false. s6 is variable so operation is performed at run time So Jaiswal is stored in constant pool
        // and Raj Jaiswal is created as new object and stored in heap

        final String s8 = "Raj ";
        String s9 = s8+"Jaiswal";
        System.out.println(s4==s9);//true. Because s8 is constant as it is final and hence both are constant operation is performed
        // at compile time
    }
}
