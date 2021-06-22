package multiThread_way1;
//join方法用于插队，当插入线程完毕后原线程才能接着执行
public class JoinTest  extends Thread {
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

    public static void main(String[] args) throws InterruptedException {
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
            if (i == 50){
                jt.join();// jt线程插队
            }
        }
    }
}
