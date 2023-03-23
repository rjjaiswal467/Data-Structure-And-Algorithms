package newpackage;

class PrintNumbers {
    private int n;
    private int current;

    public PrintNumbers(int n) {
        this.n = n;
        this.current = 1;
    }

    public void printOdd() {
        while (current <= n) {
//            synchronized(this)
            {
                if (current % 2 == 1) {
                    System.out.println(current);
                    current++;
                }
            }
        }
    }

    public void printEven() {
        while (current <= n) {
//            synchronized(this)
            {
                if (current % 2 == 0) {
                    System.out.println(current);
                    current++;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers(5);
        Thread t1 = new Thread(() -> pn.printOdd());
        Thread t2 = new Thread(() -> pn.printEven());
        t1.start();
        t2.start();
    }
}
