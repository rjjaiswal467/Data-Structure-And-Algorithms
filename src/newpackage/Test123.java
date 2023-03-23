package newpackage;

public class Test123 {
    public static void main(String[] args) {
        try{

            int a = 1/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Some Exception Occured");
        }catch(Exception e){
            System.out.println("Some ArthmeticException Occured");
        }
    }
}
