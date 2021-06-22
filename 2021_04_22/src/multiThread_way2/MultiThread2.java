package multiThread_way2;

import java.util.Random;

//实现多线程的方法2：实现Runable接口，重写run方法
public class MultiThread2 implements Runnable{

    int x = 10000;
    @Override
    public void run() {
        while (x>0){
            //添加同步锁解决同步问题
            //synchronized(互斥对象)
            synchronized (this){
                x--;
                try {
                    //Thread.sleep((int)(Math.random()*100));
                    Thread.sleep(new Random().nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"跑了"+x+"米");
            }

        }
    }
}
