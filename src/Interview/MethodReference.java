package Interview;

interface Sayable{
    void say();
}
public class MethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
//    public static void main(String[] args) {
//        // using lambda function
//        Sayable sayable = ()-> saySomething();
//        // Calling interface method
//        sayable.say();
//    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReference::saySomething;
        // Calling interface method
        sayable.say();
    }

}
