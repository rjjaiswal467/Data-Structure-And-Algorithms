package multithreading;

public class Syncronization_Demo {

    public synchronized void  print_Number(int num){
        for (int i = num; i <=num+10 ; i++) {
        System.out.print("Counting number: ");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e); }
        System.out.println(i);
        } } }

class My_Thread extends Thread{
    Syncronization_Demo demo;
    int num;
    My_Thread(Syncronization_Demo demo, int num){
        this.demo=demo;
        this.num = num;
    }
    public void run(){
        demo.print_Number(num);
    }
}

class Final_Class{

public static void main(String[] args) {
    Syncronization_Demo d = new Syncronization_Demo();
    My_Thread my_thread1 = new My_Thread(d,10);
    My_Thread my_thread2 = new My_Thread(d,50);
    my_thread1.start();
    my_thread2.start();
    }
}
