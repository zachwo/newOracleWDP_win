package multiThread;

import com.sun.jdi.PathSearchingVirtualMachine;

// yield()方法用于礼让
// 发出礼让行为的线程会释放占用的cpu然后和其他被礼让的线程一起去重新抢占cpu
// 所以被礼让线程不一定能够抢到线程
public class YieldTest extends Thread {
    @Override
    public void run() {
        for (int  i = 1 ; i<=100 ;i++){
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" 跑了"+ i + "米");
            if (i == 50){
                yield();
            }
        }
    }

    public static void main(String[] args) {
        JoinTest jt = new JoinTest();
        jt.setName("张三");
        jt.start();

        for (int i = 1 ;i<=100;i++){
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(  Thread.currentThread().getName()+"跑了"+i+ "米");
        }
    }
}
