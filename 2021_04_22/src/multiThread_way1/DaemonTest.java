package multiThread_way1;

/**
 * setDaemon(true); 设置守护线程   精灵线程
 * 守护线程守护全部非daemon线程
 * 如果全部正常线程先结束（其中某一个正常线程先运行结束不受影响），守护线程即使没运行完也会结束
 */
public class DaemonTest extends Thread {
    @Override
    public void run() {
        for (int  i = 1 ; i<=100 ;i++){
            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" 跑了"+ i + "米");
        }
    }

    public static void main(String[] args) {
        DaemonTest t = new DaemonTest();
        t.setDaemon(true);
        t.setName("守护线程");
        t.start();
        DaemonTest t1 = new DaemonTest();
        t1.setName("普通线程");
        t1.start();

        for (int i =1; i<=100 ;i++){
            try {
                Thread.sleep((int)(Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" 跑了"+ i + "米");
        }
    }
}
