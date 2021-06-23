package com.BreadStore;

import java.util.Random;

/**
 * wait();   让持有当前对象锁的线程对象 进行休眠 会释放锁
 * wait()不同于sleep()设置时间到点自己醒，wait()需要和notify()搭配使用才能唤醒
 *
 * notify();  在当前对象锁的等待线程池中找出一个 进行唤醒
 *
 * notifyAll();  在当前对象锁的等待线程池中唤醒所有
 */
public class BreadHut {
    int breadNum = 0;
    public synchronized void produceBread(){
        if (breadNum >=100){
            System.out.println("面包做多了，赶紧卖");
//            try {
//                notify(); //先唤醒生产线程
//                wait();   //再自己休眠
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
//                notify(); //先唤醒生产线程
//                wait();   //再休眠本线程
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
