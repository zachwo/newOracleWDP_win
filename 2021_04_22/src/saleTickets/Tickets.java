package saleTickets;

import java.util.Random;

public class Tickets implements Runnable{
    private int number;

    public Tickets(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (number>0){
            synchronized (this){
                number--;
                try {
                    //Thread.sleep(new Random().nextInt(1000));
                    Thread.sleep((int)(Math.random()*10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"窗口售出一张车票，当前剩余票数："+number);
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
