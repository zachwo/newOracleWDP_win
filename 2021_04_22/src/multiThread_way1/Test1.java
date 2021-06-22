package multiThread_way1;
//实现多线程的方法一：继承Thread类，重写run()方法
public class Test1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<=100; i++){
            System.out.println(getName()+"跑了"+ i + "米");
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setName("张三");
        test1.start();  //通过start()方法启动test1线程，并执行run()方法
        //test1.run();    //调用run方法并没有开启一个线程，只是顺序执行run()里面的代码
        //start方法 是开启一个线程
        //run方法 是线程开启后要执行的方法
        //如果 直接调用 run 方法 是 串行 (顺序执行)
        //如果 调用的start()  开启新线程   并发请求

        Test1 test11 = new Test1();
        test11.setName("李四");
        test11.start();
        for (int i = 0 ; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
        }
    }
}
