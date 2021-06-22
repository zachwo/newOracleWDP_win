package multiThread_way2;

public class Test  {
    public static void main(String[] args) {
        MultiThread2 m1 = new MultiThread2();
        //创建两个线程操作同一个对象
        Thread thread1 = new Thread(m1,"线程1");
        Thread thread2 = new Thread(m1,"线程2");

        thread1.start();
        thread2.start();
    }
}
