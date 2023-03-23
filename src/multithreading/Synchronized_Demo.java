package multithreading;

class Display{
//    synchronized (this);
    public static synchronized void wish(String name){
//        synchronized (Display.class) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Hello: ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
//        }
    }


}

class MyThread extends Thread{
    String name;
    Display display;

    MyThread(Display display,String name){
        this.display = display;
        this.name = name;
    }

    @Override
    public void run(){
        display.wish(name);
    }

}
public class Synchronized_Demo {
    public static void main(String[] args) {

        Display d = new Display();
        Display d1 = new Display();

        MyThread t1 = new MyThread(d, "sss");
        MyThread t2 = new MyThread(d1, "Deepak");
        t1.start();
        t2.start();
    }
}