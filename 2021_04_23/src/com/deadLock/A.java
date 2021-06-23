package com.deadLock;

public class A {
    /**
     * 加锁之后    锁住对象
     *
     * a线程 进入了 对象的 一个同步(加锁)方法
     * b线程 无法进入该同步(加锁)方法，因为锁的是对象
     * b线程 '不能'进入该对象的其他同步方法
     * b线程 可以访问该对象的非同步方法
     *
     * 设计类方法的时候为了避免产生死锁，应该尽量不要让同步方法调用另一个同步方法
     * @param b
     */
    public synchronized void useB(B b){
        System.out.println("执行了A类的useB方法");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.funcB();//调用了另一个同步方法
    }

    public synchronized void funcA(){
        System.out.println("执行了A类的funcA方法");
    }
}
