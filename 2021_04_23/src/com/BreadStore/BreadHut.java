package com.BreadStore;

import java.util.Random;

public class BreadHut {
    int breadNum = 50;
    public synchronized void produceBread(){
        if (breadNum >=100){
            System.out.println("面包做多了，赶紧卖");
//            try {
//                notify();
//                wait();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else {
            breadNum ++ ;
            System.out.println("生产了一个面包，当前面包量："+breadNum);
        }
    }

    public synchronized void saleBread(){
        if (breadNum <= 0){
            System.out.println("面包卖没了，赶紧做");
//            try {
//                notify();
//                wait();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else {
            breadNum--;
            System.out.println("卖了一个面包，当前面包量："+breadNum);
        }
    }
}
