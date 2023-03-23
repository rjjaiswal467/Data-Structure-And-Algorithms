package testing;

class Parents{
    String sk;
    int q=1;
    void show(){
        System.out.println("In Parent");
    }
}

class Child extends Parents{

    void show() {
        System.out.println("In Child2");
    }
}

public class InheritanceTest {

    public static void main(String[] args) {

        Parents p1 = new Parents();
        p1.show();
        Parents p2 = new Child();
        p2.show();
    }
}
