package saleTickets;

public class Test {
    public static void main(String[] args) {
        Tickets tickets = new Tickets(1000);
        Thread thread1 = new Thread(tickets,"一号");
        Thread thread2 = new Thread(tickets,"二号");
        System.out.println("车票开售，总票数："+tickets.getNumber());
        thread1.start();
        thread2.start();
    }
}
