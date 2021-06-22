package multiThread_way1;

public class SetPriorityTest extends Thread{
    @Override
    public void run() {
        for (int  i = 1 ; i<=100 ;i++){
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" 跑了"+ i + "米");
        }
    }

    public static void main(String[] args) {
        SetPriorityTest thread = new SetPriorityTest();
        // setPriority(1~10)设置线程的优先级1～10十个级别，优先级越高，线程先被执行的概率就越高，就越有可能先运行完
        thread.setPriority(Thread.MAX_PRIORITY);//10
        thread.setName("张三");
        thread.start();

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
