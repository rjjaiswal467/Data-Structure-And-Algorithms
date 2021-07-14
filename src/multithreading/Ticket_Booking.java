package multithreading;

public class Ticket_Booking {
    static int available_seats=12;

    public synchronized void  book_Tickets(int num)
    {
            if(available_seats>=num){
                System.out.println("Congratulations!! your " +num+ " seat is booked");
                available_seats = available_seats-num;
            }
            else{
                System.out.println("Sorry seats are not available");
            }
        System.out.println("Available seats are "+available_seats);

         }
    }

        class My_Thread1 extends Thread{
            Ticket_Booking sd;
            int no_of_seats;
             My_Thread1 (Ticket_Booking d, int num){
                 this.sd = d;
                this.no_of_seats=num;
             }

             public void run(){
                sd.book_Tickets(no_of_seats);
             }
        }

        class Final_Class1{

            public static void main(String[] args) {
                Ticket_Booking sd = new Ticket_Booking();
                My_Thread1 my_thread1 = new My_Thread1(sd,5);
                My_Thread1 my_thread2 = new My_Thread1(sd,4);
                My_Thread1 my_thread3 = new My_Thread1(sd,6);
                My_Thread1 my_thread4 = new My_Thread1(sd,3);
                my_thread1.start();
                my_thread2.start();
                my_thread3.start();
                my_thread4.start();

            }
        }
