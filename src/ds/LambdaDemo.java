package ds;

interface A{
    void show(); //by default public.
}
//class xyz implements A{
//
//    public void show() {
//        System.out.println("Hello");
//    }
//}
public class LambdaDemo {
    public static void main(String[] args) {

        A obj;
//        obj =new A() //Anonymous Inner class
//            {
//            @Override
//            public void show()
//            {
//                System.out.println("Hi");
//            }
//        };
            // OR
        obj =() ->
            {
                System.out.println("Hi");
            }
        ;
        obj.show();
    }
}
